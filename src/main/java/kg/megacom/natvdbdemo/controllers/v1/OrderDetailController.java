package kg.megacom.natvdbdemo.controllers.v1;

import kg.megacom.natvdbdemo.controllers.BaseCrudController;
import kg.megacom.natvdbdemo.models.dto.OrderDetailDto;

import java.util.List;

public class OrderDetailController implements BaseCrudController<OrderDetailDto,Long> {
    @Override
    public OrderDetailDto save(OrderDetailDto orderDetailDto) {
        return null;
    }

    @Override
    public OrderDetailDto update(OrderDetailDto orderDetailDto) {
        return null;
    }

    @Override
    public List<OrderDetailDto> findAll() {
        return null;
    }

    @Override
    public OrderDetailDto findById(Long id) {
        return null;
    }
}
