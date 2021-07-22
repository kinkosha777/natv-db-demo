package kg.megacom.natvdbdemo.services.impl;

import kg.megacom.natvdbdemo.dao.OrderDetailRepository;
import kg.megacom.natvdbdemo.mappers.OrderDetailMapper;
import kg.megacom.natvdbdemo.models.Discount;
import kg.megacom.natvdbdemo.models.OrderDetail;
import kg.megacom.natvdbdemo.models.dto.OrderDetailDto;
import kg.megacom.natvdbdemo.services.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderDetailServiceImpl implements OrderDetailService {
    @Autowired
    OrderDetailRepository orderDetailRepository;
    @Autowired
    OrderDetailMapper orderDetailMapper;
    @Override
    public OrderDetailDto save(OrderDetailDto orderDetailDto) {
        OrderDetail orderDetail = orderDetailMapper.toOrderDetail(orderDetailDto);
        orderDetail = orderDetailRepository.save(orderDetail);

        return orderDetailMapper.toOrderDetailDto(orderDetail);
    }

    @Override
    public OrderDetailDto update(OrderDetailDto orderDetailDto) {
        if (!orderDetailRepository.existsById(orderDetailDto.getId()))
            throw new RuntimeException("ОрдерДетайл не найден!");
        OrderDetail orderDetail = orderDetailMapper.toOrderDetail(orderDetailDto);
        orderDetail = orderDetailRepository.save(orderDetail);
        return orderDetailMapper.toOrderDetailDto(orderDetail);
    }

    @Override
    public List<OrderDetailDto> findAll() {
        return orderDetailMapper.toOrderDetailDtos(orderDetailRepository.findAll());
    }

    @Override
    public OrderDetailDto findById(Long id) {
        OrderDetail orderDetail = orderDetailRepository.findById(id).orElseThrow(()->new RuntimeException("ОрдерДетайл не найден!"));
        return orderDetailMapper.toOrderDetailDto(orderDetail);
    }
}
