package kg.megacom.natvdbdemo.mappers;

import kg.megacom.natvdbdemo.models.Order;
import kg.megacom.natvdbdemo.models.dto.OrderDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface OrderMapper {
      OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

      Order toOrder(OrderDto orderDto);
      OrderDto toOrderDto (Order order);

      List<Order> toOrders(List<OrderDto> orderDtos);
      List<OrderDto> toOrderDtos(List<Order> orders);

}
