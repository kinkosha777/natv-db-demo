package kg.megacom.natvdbdemo.mappers;

import kg.megacom.natvdbdemo.models.Channel;
import kg.megacom.natvdbdemo.models.Day;
import kg.megacom.natvdbdemo.models.dto.ChannelDto;
import kg.megacom.natvdbdemo.models.dto.DayDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface DayMapper {
    DayMapper INSTANCE = Mappers.getMapper(DayMapper.class);

    Day toDay(DayDto dayDto);
    DayDto toDayDto(Day day);

    List<Day> toDays(List<DayDto> dayDtos);
    List<DayDto> toDaysDtos(List<Day> days);
}
