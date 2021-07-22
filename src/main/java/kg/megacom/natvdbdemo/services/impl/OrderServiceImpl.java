package kg.megacom.natvdbdemo.services.impl;

import kg.megacom.natvdbdemo.dao.OrderRepository;
import kg.megacom.natvdbdemo.mappers.OrderMapper;
import kg.megacom.natvdbdemo.models.Order;
import kg.megacom.natvdbdemo.models.dto.OrderDto;
import kg.megacom.natvdbdemo.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderRepository orderRepository;

    @Override
    public OrderDto save(OrderDto orderDto) {
        Order order = OrderMapper.INSTANCE.toOrder(orderDto);
        order = orderRepository.save(order);
        return OrderMapper.INSTANCE.toOrderDto(order);
    }

    @Override
    public OrderDto update(OrderDto orderDto) {
        if (!orderRepository.existsById(orderDto.getId()))
            throw new RuntimeException("Ордер не найден!");
        Order order = OrderMapper.INSTANCE.toOrder(orderDto);
        order = orderRepository.save(order);
        return OrderMapper.INSTANCE.toOrderDto(order);
    }

    @Override
    public List<OrderDto> findAll() {
        return OrderMapper.INSTANCE.toOrderDtos(orderRepository.findAll());
    }

    @Override
    public OrderDto findById(Long id) {
        Order order = orderRepository.findById(id).orElseThrow(()->new RuntimeException("Ордер не найден!"));
        return OrderMapper.INSTANCE.toOrderDto(order);
    }
}
