package kg.megacom.natvdbdemo.controllers.v1;

import kg.megacom.natvdbdemo.controllers.BaseCrudController;
import kg.megacom.natvdbdemo.models.dto.OrderDto;
import kg.megacom.natvdbdemo.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("api/v1/order")
public class OrderController implements BaseCrudController<OrderDto,Long> {
    @Autowired
    OrderService orderService;
    @Override
    public OrderDto save(OrderDto orderDto) {
        return orderService.save(orderDto);
    }

    @Override
    public OrderDto update(OrderDto orderDto) {
        return orderService.save(orderDto);
    }

    @Override
    public List<OrderDto> findAll() {
        return orderService.findAll();
    }

    @Override
    public OrderDto findById(Long id) {
        return orderService.findById(id);
    }
}
