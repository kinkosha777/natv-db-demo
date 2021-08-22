package kg.megacom.natvdbdemo.services.impl;

import kg.megacom.natvdbdemo.dao.DayRepository;
import kg.megacom.natvdbdemo.mappers.DayMapper;
import kg.megacom.natvdbdemo.models.dto.DayDto;
import kg.megacom.natvdbdemo.models.dto.OrderDetailDto;
import kg.megacom.natvdbdemo.services.DayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class DayServiceImpl implements DayService {
    @Autowired
    DayRepository dayRepository;



    @Override
    public void save(Date date, OrderDetailDto orderDetailDto) {
        DayDto dayDto = new DayDto();
        dayDto.setDay(date);
        dayDto.setOrderDetailDto(orderDetailDto);
        dayRepository.save(DayMapper.INSTANCE.toDay(dayDto));

    }
}
