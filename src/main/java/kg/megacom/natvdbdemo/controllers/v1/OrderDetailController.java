package kg.megacom.natvdbdemo.controllers.v1;

import kg.megacom.natvdbdemo.controllers.BaseCrudController;
import kg.megacom.natvdbdemo.models.dto.OrderDetailDto;
import kg.megacom.natvdbdemo.services.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("api/v1/orderDetail")
public class OrderDetailController implements BaseCrudController<OrderDetailDto,Long> {
    @Autowired
    OrderDetailService orderDetailService;

    @Override
    public OrderDetailDto save(OrderDetailDto orderDetailDto) {
        return orderDetailService.save(orderDetailDto);
    }

    @Override
    public OrderDetailDto update(OrderDetailDto orderDetailDto) {
        return orderDetailService.save(orderDetailDto);
    }

    @Override
    public List<OrderDetailDto> findAll() {
        return orderDetailService.findAll();
    }

    @Override
    public OrderDetailDto findById(Long id) {
        return orderDetailService.findById(id);
    }
}
