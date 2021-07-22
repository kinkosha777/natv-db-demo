package kg.megacom.natvdbdemo.services.impl;

import kg.megacom.natvdbdemo.dao.PriceRepository;
import kg.megacom.natvdbdemo.mappers.PriceMapper;
import kg.megacom.natvdbdemo.models.Price;
import kg.megacom.natvdbdemo.models.dto.PriceDto;
import kg.megacom.natvdbdemo.services.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PriceServiceImpl implements PriceService {
    @Autowired
    PriceRepository priceRepository;

    @Override
    public PriceDto save(PriceDto priceDto) {
        Price price = PriceMapper.INSTANCE.toPrice(priceDto);
        price = priceRepository.save(price);
        return PriceMapper.INSTANCE.toPriceDto(price);
    }

    @Override
    public PriceDto update(PriceDto priceDto) {
        if (!priceRepository.existsById(priceDto.getId()))
            throw new RuntimeException("Прайс не найден!");
        Price price = PriceMapper.INSTANCE.toPrice(priceDto);
        price = priceRepository.save(price);
        return PriceMapper.INSTANCE.toPriceDto(price);
    }

    @Override
    public List<PriceDto> findAll() {
        return PriceMapper.INSTANCE.toPriceDtos(priceRepository.findAll());
    }

    @Override
    public PriceDto findById(Long id) {
        Price price = priceRepository.findById(id).orElseThrow(()->new RuntimeException("Прайс не найден!"));

        return PriceMapper.INSTANCE.toPriceDto(price);
    }
}
