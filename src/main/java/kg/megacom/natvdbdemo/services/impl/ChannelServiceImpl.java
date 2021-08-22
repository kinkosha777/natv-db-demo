package kg.megacom.natvdbdemo.services.impl;

import kg.megacom.natvdbdemo.controllers.exceptions.ChannelNotFound;
import kg.megacom.natvdbdemo.dao.ChannelRepository;
import kg.megacom.natvdbdemo.mappers.ChannelMapper;
import kg.megacom.natvdbdemo.models.Channel;
import kg.megacom.natvdbdemo.models.dto.ChannelDto;
import kg.megacom.natvdbdemo.models.dto.DiscountDto;
import kg.megacom.natvdbdemo.models.dto.PriceDto;
import kg.megacom.natvdbdemo.models.toFrontEnd.DiscountData;
import kg.megacom.natvdbdemo.models.toFrontEnd.Output;
import kg.megacom.natvdbdemo.services.ChannelService;
import kg.megacom.natvdbdemo.services.DiscountService;
import kg.megacom.natvdbdemo.services.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ChannelServiceImpl implements ChannelService {
    @Autowired
    ChannelRepository channelRepository;
    @Autowired
    PriceService priceService;
    @Autowired
    DiscountService discountService;


    @Override
    public ChannelDto save(ChannelDto channelDto) {
        channelDto.setActive(true);
        Channel channel = ChannelMapper.INSTANCE.toChannel(channelDto);
        channel = channelRepository.save(channel);
        System.out.println(channelDto);
        System.out.println(channel);
        return ChannelMapper.INSTANCE.toChannelDto(channel);
    }

    @Override
    public ChannelDto findChanelByIdForDiscount(Long id) {
        return ChannelMapper.INSTANCE.toChannelDto(channelRepository.findById(id).orElseThrow(()->new ChannelNotFound("Id по такому каналу не найден!")));
    }

    @Override
    public ChannelDto findById(Long id) {
        return ChannelMapper.INSTANCE.toChannelDto(channelRepository.findById(id).orElseThrow(()->new RuntimeException("asdsadsadsad")));
    }

    @Override
    public List<Output> outPutChannels() {
        List<PriceDto> activeChannelPrice = priceService.allActiveChannelsPrice();
        System.out.println("***********"+activeChannelPrice);
        List<PriceDto> activeChannelFilteredByPrice = activeChannelPrice
                .stream()
                .filter(x->x.getChannel().isActive())
                .collect(Collectors.toList());
        System.out.println("***********"+activeChannelFilteredByPrice);

        List<Output> outputChannels = new ArrayList<>();
        for (PriceDto p : activeChannelFilteredByPrice){
            Output output = new Output();
            output.setId(p.getChannel().getId());
            output.setChannelName(p.getChannel().getName());
            output.setImage(p.getChannel().getPhoto());
            output.setPrice(p.getPrice());

            List<DiscountDto> activeChannelDiscounts = discountService.allActiveChannelDiscounts(p.getChannel().getId());
            List<DiscountData> discountDataList = new ArrayList<>();
            for (DiscountDto d : activeChannelDiscounts){
                DiscountData discountData = new DiscountData();
                discountData.setMinDays(d.getMindDays());
                discountData.setPercent(d.getPercent());
                discountDataList.add(discountData);
            }
            output.setDiscountsData(discountDataList);
            outputChannels.add(output);
        }
        return outputChannels;


    }


}
