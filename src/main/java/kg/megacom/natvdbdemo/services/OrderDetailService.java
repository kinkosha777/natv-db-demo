package kg.megacom.natvdbdemo.services;

import kg.megacom.natvdbdemo.models.OrderDetail;
import kg.megacom.natvdbdemo.models.dto.OrderDetailDto;
import kg.megacom.natvdbdemo.models.dto.OrderDto;

import java.util.List;

public interface OrderDetailService {

    OrderDetailDto save(OrderDetail orderDetail);
    List<OrderDetailDto> findAllByOrder(OrderDto orderSaving);
}
