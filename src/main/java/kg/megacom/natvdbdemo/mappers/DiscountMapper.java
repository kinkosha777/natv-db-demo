package kg.megacom.natvdbdemo.mappers;

import kg.megacom.natvdbdemo.models.Discount;
import kg.megacom.natvdbdemo.models.dto.DiscountDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface DiscountMapper {
    DiscountMapper INSTANCE = Mappers.getMapper(DiscountMapper.class);

    Discount toDiscount(DiscountDto discountDto);
    DiscountDto toDiscountDto(Discount discount);
}
