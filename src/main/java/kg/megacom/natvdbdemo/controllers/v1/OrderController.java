package kg.megacom.natvdbdemo.controllers.v1;

import kg.megacom.natvdbdemo.controllers.BaseCrudController;
import kg.megacom.natvdbdemo.models.dto.OrderDto;

import java.util.List;

public class OrderController implements BaseCrudController<OrderDto,Long> {
    @Override
    public OrderDto save(OrderDto orderDto) {
        return null;
    }

    @Override
    public OrderDto update(OrderDto orderDto) {
        return null;
    }

    @Override
    public List<OrderDto> findAll() {
        return null;
    }

    @Override
    public OrderDto findById(Long id) {
        return null;
    }
}
