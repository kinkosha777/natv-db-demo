package kg.megacom.natvdbdemo.controllers.v1;

import kg.megacom.natvdbdemo.controllers.BaseCrudController;
import kg.megacom.natvdbdemo.models.dto.PriceDto;

import java.util.List;

public class PriceController implements BaseCrudController<PriceDto,Long> {
    @Override
    public PriceDto save(PriceDto priceDto) {
        return null;
    }

    @Override
    public PriceDto update(PriceDto priceDto) {
        return null;
    }

    @Override
    public List<PriceDto> findAll() {
        return null;
    }

    @Override
    public PriceDto findById(Long id) {
        return null;
    }
}
