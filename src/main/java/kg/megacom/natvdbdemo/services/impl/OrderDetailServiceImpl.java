package kg.megacom.natvdbdemo.services.impl;

import kg.megacom.natvdbdemo.dao.OrderDetailRepository;
import kg.megacom.natvdbdemo.mappers.OrderDetailMapper;
import kg.megacom.natvdbdemo.mappers.OrderMapper;
import kg.megacom.natvdbdemo.models.OrderDetail;
import kg.megacom.natvdbdemo.models.dto.OrderDetailDto;
import kg.megacom.natvdbdemo.models.dto.OrderDto;
import kg.megacom.natvdbdemo.services.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderDetailServiceImpl implements OrderDetailService {
    @Autowired
    OrderDetailRepository orderDetailRepository;

    @Override
    public OrderDetailDto save(OrderDetail orderDetail) {
        return OrderDetailMapper.INSTANCE.toOrderDetailDto(orderDetailRepository.save(orderDetail));
    }

    @Override
    public List<OrderDetailDto> findAllByOrder(OrderDto orderSaving) {
        List<OrderDetail> orderDetails = orderDetailRepository.findAllByOrder(OrderMapper.INSTANCE.toOrder(orderSaving));
        return OrderDetailMapper.INSTANCE.toOrderDetailDtos(orderDetails);
    }

//    @Override
//    public OrderDetailDto save(OrderDetailDto orderDetailDto) {
//        OrderDetail orderDetail = OrderDetailMapper.INSTANCE.toOrderDetail(orderDetailDto);
//        orderDetail = orderDetailRepository.save(orderDetail);
//
//        return OrderDetailMapper.INSTANCE.toOrderDetailDto(orderDetail);
//    }
//
//    @Override
//    public OrderDetailDto update(OrderDetailDto orderDetailDto) {
//        if (!orderDetailRepository.existsById(orderDetailDto.getId()))
//            throw new RuntimeException("ОрдерДетайл не найден!");
//        OrderDetail orderDetail = OrderDetailMapper.INSTANCE.toOrderDetail(orderDetailDto);
//        orderDetail = orderDetailRepository.save(orderDetail);
//        return OrderDetailMapper.INSTANCE.toOrderDetailDto(orderDetail);
//    }
//
//    @Override
//    public List<OrderDetailDto> findAll() {
//        return OrderDetailMapper.INSTANCE.toOrderDetailDtos(orderDetailRepository.findAll());
//    }
//
//    @Override
//    public OrderDetailDto findById(Long id) {
//        OrderDetail orderDetail = orderDetailRepository.findById(id).orElseThrow(()->new RuntimeException("ОрдерДетайл не найден!"));
//        return OrderDetailMapper.INSTANCE.toOrderDetailDto(orderDetail);
//    }
}
