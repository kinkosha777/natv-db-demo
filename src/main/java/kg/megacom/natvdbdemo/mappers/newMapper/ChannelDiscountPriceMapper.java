package kg.megacom.natvdbdemo.mappers.newMapper;

import kg.megacom.natvdbdemo.models.Channel;
import kg.megacom.natvdbdemo.models.Discount;
import kg.megacom.natvdbdemo.models.Price;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ChannelDiscountPriceMapper {
    ChannelDiscountPriceMapper INSTANCE = Mappers.getMapper(ChannelDiscountPriceMapper.class);

//    Channel toChannel(ChannelDiscountPriceDto channelDiscountPriceDto);
//    Discount toDiscount(ChannelDiscountPriceDto channelDiscountPriceDto);
//    Price toPriceChannel(ChannelDiscountPriceDto channelDiscountPriceDto);





}
