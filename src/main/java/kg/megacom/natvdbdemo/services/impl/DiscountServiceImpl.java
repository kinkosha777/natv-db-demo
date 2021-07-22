package kg.megacom.natvdbdemo.services.impl;

import kg.megacom.natvdbdemo.dao.DiscountRepository;
import kg.megacom.natvdbdemo.mappers.DiscountMapper;
import kg.megacom.natvdbdemo.models.Discount;
import kg.megacom.natvdbdemo.models.dto.DiscountDto;
import kg.megacom.natvdbdemo.services.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DiscountServiceImpl implements DiscountService {
    @Autowired
    DiscountRepository discountRepository;
    @Autowired
    DiscountMapper discountMapper;
    @Override
    public DiscountDto save(DiscountDto discountDto) {
        Discount discount = discountMapper.toDiscount(discountDto);
        discount = discountRepository.save(discount);
        return discountMapper.toDiscountDto(discount);
    }

    @Override
    public DiscountDto update(DiscountDto discountDto) {
        if (!discountRepository.existsById(discountDto.getId()))
            throw  new RuntimeException("Дискоунт не найден!");
        Discount discount = discountMapper.toDiscount(discountDto);
        discount = discountRepository.save(discount);
        return discountMapper.toDiscountDto(discount);
    }

    @Override
    public List<DiscountDto> findAll() {
        return discountMapper.toDiscountsDtos(discountRepository.findAll());
    }

    @Override
    public DiscountDto findById(Long id) {
    Discount discount = discountRepository.findById(id).orElseThrow(()->new RuntimeException("Дискаунт не найден!"));
        return discountMapper.toDiscountDto(discount);
    }
}
