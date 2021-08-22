package kg.megacom.natvdbdemo.services.impl;

import kg.megacom.natvdbdemo.dao.PriceRepository;
import kg.megacom.natvdbdemo.mappers.PriceMapper;
import kg.megacom.natvdbdemo.models.Price;
import kg.megacom.natvdbdemo.models.dto.PriceDto;
import kg.megacom.natvdbdemo.models.toFrontEnd.InputPriceData;
import kg.megacom.natvdbdemo.services.ChannelService;
import kg.megacom.natvdbdemo.services.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PriceServiceImpl implements PriceService {
    @Autowired
    PriceRepository priceRepository;
    @Autowired
    ChannelService channelService;


    @Override
    public PriceDto savePriceForChannel(InputPriceData inputPriceData) {
        PriceDto priceDto = new PriceDto();
        priceDto.setChannel(channelService.findChanelByIdForDiscount(inputPriceData.getChannelId()));
        priceDto.setStartDate(inputPriceData.getStartDate());
        priceDto.setEndDate(inputPriceData.getEndDate());
        priceDto.setPrice(inputPriceData.getPrice());
        System.out.println(priceDto);
        return PriceMapper.INSTANCE.toPriceDto(priceRepository.save(PriceMapper.INSTANCE.toPrice(priceDto)));
    }

    @Override
    public List<PriceDto> allActiveChannelsPrice() {
        // sout priceRepository.findAll()
        return PriceMapper.INSTANCE.toPriceDtos(priceRepository.allActiveChannelsPrices());
    }

    @Override
    public PriceDto findByChannelAndDate(Long id) {
        return PriceMapper.INSTANCE.toPriceDto(priceRepository.findByChannelAndDate(id));
    }
}
