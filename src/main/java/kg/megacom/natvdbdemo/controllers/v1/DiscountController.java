package kg.megacom.natvdbdemo.controllers.v1;

import kg.megacom.natvdbdemo.controllers.BaseCrudController;
import kg.megacom.natvdbdemo.models.dto.DiscountDto;
import kg.megacom.natvdbdemo.services.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("api/v1/discount")
public class DiscountController implements BaseCrudController<DiscountDto,Long> {
    @Autowired
    DiscountService discountService;
    @Override
    public DiscountDto save(DiscountDto discountDto) {
        return discountService.save(discountDto);
    }

    @Override
    public DiscountDto update(DiscountDto discountDto) {
        return discountService.save(discountDto);
    }

    @Override
    public List<DiscountDto> findAll() {
        return discountService.findAll();
    }

    @Override
    public DiscountDto findById(Long id) {
        return discountService.findById(id);
    }
}
