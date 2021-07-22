package kg.megacom.natvdbdemo.mappers;

import kg.megacom.natvdbdemo.models.Day;
import kg.megacom.natvdbdemo.models.dto.DayDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface DayMapper {
    DayMapper INSTANCE = Mappers.getMapper(DayMapper.class);

    Day toDay(DayDto dayDto);
    DayDto toDayDto(Day day);
}
