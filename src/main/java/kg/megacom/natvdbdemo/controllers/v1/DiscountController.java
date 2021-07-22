package kg.megacom.natvdbdemo.controllers.v1;

import kg.megacom.natvdbdemo.controllers.BaseCrudController;
import kg.megacom.natvdbdemo.models.dto.DiscountDto;

import java.util.List;

public class DiscountController implements BaseCrudController<DiscountDto,Long> {
    @Override
    public DiscountDto save(DiscountDto discountDto) {
        return null;
    }

    @Override
    public DiscountDto update(DiscountDto discountDto) {
        return null;
    }

    @Override
    public List<DiscountDto> findAll() {
        return null;
    }

    @Override
    public DiscountDto findById(Long id) {
        return null;
    }
}
