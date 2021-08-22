package kg.megacom.natvdbdemo.controllers.v1;

import kg.megacom.natvdbdemo.controllers.BaseCrudController;
import kg.megacom.natvdbdemo.models.dto.OrderDto;
import kg.megacom.natvdbdemo.models.toFrontEnd.InputOrderData;
import kg.megacom.natvdbdemo.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("api/v1/order")
public class OrderController  {
    @Autowired
    OrderService orderService;

    @PostMapping("save-Order")
    public InputOrderData saveOrder(@RequestBody InputOrderData inputOrderData) {
        return orderService.save(inputOrderData);
    }

}
