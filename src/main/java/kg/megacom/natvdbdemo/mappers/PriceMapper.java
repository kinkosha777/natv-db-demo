package kg.megacom.natvdbdemo.mappers;

import kg.megacom.natvdbdemo.models.Price;
import kg.megacom.natvdbdemo.models.dto.PriceDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PriceMapper {
    PriceMapper INSTANCE = Mappers.getMapper(PriceMapper.class);

    Price toPrice (PriceDto priceDto);
    PriceDto toPriceDto(Price price);

    List<Price> toPrices(List<PriceDto> priceDtos);
    List<PriceDto> toPriceDtos(List<Price> prices);

}
