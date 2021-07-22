package kg.megacom.natvdbdemo.controllers.v1;

import kg.megacom.natvdbdemo.controllers.BaseCrudController;
import kg.megacom.natvdbdemo.models.dto.PriceDto;
import kg.megacom.natvdbdemo.services.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("api/v1/price")
public class PriceController implements BaseCrudController<PriceDto,Long> {
    @Autowired
    PriceService priceService;
    @Override
    public PriceDto save(PriceDto priceDto) {
        return priceService.save(priceDto);
    }

    @Override
    public PriceDto update(PriceDto priceDto) {
        return priceService.save(priceDto);
    }

    @Override
    public List<PriceDto> findAll() {
        return priceService.findAll();
    }

    @Override
    public PriceDto findById(Long id) {
        return priceService.findById(id);
    }
}
