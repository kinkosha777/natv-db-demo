package kg.megacom.natvdbdemo.services.impl;

import kg.megacom.natvdbdemo.dao.OrderRepository;
import kg.megacom.natvdbdemo.enums.OrderStatus;
import kg.megacom.natvdbdemo.mappers.OrderDetailMapper;
import kg.megacom.natvdbdemo.mappers.OrderMapper;
import kg.megacom.natvdbdemo.models.Order;
import kg.megacom.natvdbdemo.models.dto.*;
import kg.megacom.natvdbdemo.models.toFrontEnd.InputChannelData;
import kg.megacom.natvdbdemo.models.toFrontEnd.InputOrderData;
import kg.megacom.natvdbdemo.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    ChannelService channelService;
    @Autowired
    DiscountService discountService;
    @Autowired
    PriceService priceService;
    @Autowired
    OrderDetailService orderDetailService;
    @Autowired
    DayService dayService;

    @Override
    public InputOrderData save(InputOrderData inputOrderData) {
        Order order = new Order();
        order.setText(inputOrderData.getText());
        order.setName(inputOrderData.getName());
        order.setPhone(inputOrderData.getPhone());
        order.setEmail(inputOrderData.getEmail());
        order.setOrderStatus(OrderStatus.IN_PROCESS);
        order.setAddDate(new Date());
        order.setEditDate(new Date());
        OrderDto orderDto = OrderMapper.INSTANCE.toOrderDto(orderRepository.save(order));
        String textLength = order.getText().replaceAll("\\s+", "");

        double totalPrice;

        List<InputChannelData> inputChannelData = inputOrderData.getInputChannelDataList();
        for (InputChannelData i : inputChannelData) {
            OrderDetailDto orderDetailDto = new OrderDetailDto();
            orderDetailDto.setOrder(orderDto);
            orderDetailDto.setChannel(channelService.findById(i.getChannelId()));
            int days = i.getDays().size();
            DiscountDto discountDto = new DiscountDto();
            PriceDto priceDto = priceService.findByChannelAndDate(i.getChannelId());
            double pricePerSymbol = priceDto.getPrice();
            int sizeAdText = textLength.length();

            OrderDetailDto orderDetailDto1;

            if (discountDto != null) {
                double percent = discountDto.getPercent();
                double withoutDiscount = pricePerSymbol * sizeAdText;
                double discountInSum = withoutDiscount * percent / 100;
                double sumForChanel = (withoutDiscount - discountInSum) * days;
                orderDetailDto.setPrice(sumForChanel);
                orderDetailDto1 = orderDetailService.save(OrderDetailMapper.INSTANCE.toOrderDetail(orderDetailDto));
            } else {
                double withoutDiscount = (pricePerSymbol * sizeAdText) * days;
                orderDetailDto.setPrice(withoutDiscount);
                orderDetailDto1 = orderDetailService.save(OrderDetailMapper.INSTANCE.toOrderDetail(orderDetailDto));

                List<Date> date = i.getDays();
                date.forEach(d -> {
                    dayService.save(d, orderDetailDto1);
                });
            }

        }
        return inputOrderData;
//        inputChannelData.stream()
//                .map(x -> {
//                    OrderDetailDto orderDetailDto = new OrderDetailDto();
//                    orderDetailDto.setOrder(orderDto);
//                    orderDetailDto.setChannel(channelService.findChanelByIdForDiscount(x.getChannelId()));
//                    int days = x.getDays().size();
//                    DiscountDto discountDto = discountService.findByChannelAndMinDay(days, x.getChannelId());
//                    PriceDto priceDto = priceService.findByChannelAndDate(x.getChannelId());
//                    int sizeText = textLength.length();
//                    double price = priceDto.getPrice();
//
//                    OrderDetailDto orderDetailDto1;
//                    if (discountDto != null) {
//                        double percent = discountDto.getPercent();
//                        double withoutDiscount = price * sizeText;
//                        double discountPrice = withoutDiscount * percent / 100;
//                        double priceForChannel = (withoutDiscount - discountPrice);
//                        orderDetailDto.setPrice(priceForChannel);
//                        orderDetailDto1 = orderDetailService.save(OrderDetailMapper.INSTANCE.toOrderDetail(orderDetailDto));
//
//                        List<Date> days1 = x.getDays();
//                        days1.forEach(y -> {
//                            dayService.save(y, orderDetailDto1);
//
//                        });
//                    }
//
//                    return inputChannelData;
//                }).collect(Collectors.toList());
//        System.out.println("**********" + inputChannelData);
//        System.out.println("**********" + inputOrderData);
//        return inputOrderData;
//    }
    }
}
