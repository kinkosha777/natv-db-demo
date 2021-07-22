package kg.megacom.natvdbdemo.mappers;

import kg.megacom.natvdbdemo.models.OrderDetail;
import kg.megacom.natvdbdemo.models.dto.OrderDetailDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface OrderDetailMapper {
    OrderDetailMapper INSTANCE = Mappers.getMapper(OrderDetailMapper.class);

    OrderDetail toOrderDetail(OrderDetailDto orderDetailDto);
    OrderDetailDto toOrderDetailDto(OrderDetail orderDetail);

    List<OrderDetail> toOrderDetails(List<OrderDetailDto> orderDetailDtos);
    List<OrderDetailDto> toOrderDetailDtos(List<OrderDetail> orderDetails);
}
