package kg.megacom.natvdbdemo.services.impl;

import kg.megacom.natvdbdemo.dao.DayRepository;
import kg.megacom.natvdbdemo.mappers.DayMapper;
import kg.megacom.natvdbdemo.models.Day;
import kg.megacom.natvdbdemo.models.dto.DayDto;
import kg.megacom.natvdbdemo.services.DayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DayServiceImpl implements DayService {
    @Autowired
    DayRepository dayRepository;

    @Override
    public DayDto save(DayDto dayDto) {
        Day day = DayMapper.INSTANCE.toDay(dayDto);
        day = dayRepository.save(day);
        return DayMapper.INSTANCE.toDayDto(day);
    }

    @Override
    public DayDto update(DayDto dayDto) {
    if (!dayRepository.existsById(dayDto.getId()))
        throw new RuntimeException("День не найден!");
    Day day = DayMapper.INSTANCE.toDay(dayDto);
    day = dayRepository.save(day);
        return DayMapper.INSTANCE.toDayDto(day);
    }

    @Override
    public List<DayDto> findAll() {
        return DayMapper.INSTANCE.toDaysDtos(dayRepository.findAll());
    }

    @Override
    public DayDto findById(Long id) {
        Day day  = dayRepository.findById(id).orElseThrow(()->new RuntimeException("День не найден!"));

        return DayMapper.INSTANCE.toDayDto(day);
    }
}
