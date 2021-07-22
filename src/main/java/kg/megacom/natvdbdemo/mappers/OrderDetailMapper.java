package kg.megacom.natvdbdemo.mappers;

import kg.megacom.natvdbdemo.models.OrderDetail;
import kg.megacom.natvdbdemo.models.dto.OrderDetailDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface OrderDetailMapper {
    OrderDetailMapper INSTANCE = Mappers.getMapper(OrderDetailMapper.class);

    OrderDetail toOrderDetail(OrderDetailDto orderDetailDto);
    OrderDetailDto toOrderDetailDto(OrderDetail orderDetail);
}
