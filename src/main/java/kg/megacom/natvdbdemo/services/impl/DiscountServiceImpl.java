package kg.megacom.natvdbdemo.services.impl;

import kg.megacom.natvdbdemo.dao.ChannelRepository;
import kg.megacom.natvdbdemo.dao.DiscountRepository;
import kg.megacom.natvdbdemo.mappers.DiscountMapper;
import kg.megacom.natvdbdemo.models.dto.DiscountDto;
import kg.megacom.natvdbdemo.models.toFrontEnd.DiscountData;
import kg.megacom.natvdbdemo.models.toFrontEnd.InputDiscountData;
import kg.megacom.natvdbdemo.services.ChannelService;
import kg.megacom.natvdbdemo.services.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DiscountServiceImpl implements DiscountService {
    @Autowired
    DiscountRepository discountRepository;
    @Autowired
    ChannelService channelService;

    @Override
    public DiscountDto saveNewDiscountForChannel(InputDiscountData inputDiscountData) {
       DiscountDto discountDto = new DiscountDto();
       discountDto.setChannel(channelService.findById(inputDiscountData.getChannelId()));
       discountDto.setPercent(inputDiscountData.getPercent());
       discountDto.setStartDate(inputDiscountData.getStartDate());
       discountDto.setEndDate(inputDiscountData.getEndDate());
       discountDto.setMindDays(inputDiscountData.getMinDays());
        System.out.println(discountDto);
        return DiscountMapper.INSTANCE.toDiscountDto(discountRepository.save(DiscountMapper.INSTANCE.toDiscount(discountDto)));

    }

    @Override
    public List<DiscountDto> allActiveChannelDiscounts(Long id) {
        return DiscountMapper.INSTANCE.toDiscountsDtos(discountRepository.allActiveChannelDiscounts(id));
    }

    @Override
    public DiscountDto findByChannelAndMinDay(int days, Long id) {
        return DiscountMapper.INSTANCE.toDiscountDto(discountRepository.findByTvChannelAndMinDay(days,id));
    }
}
