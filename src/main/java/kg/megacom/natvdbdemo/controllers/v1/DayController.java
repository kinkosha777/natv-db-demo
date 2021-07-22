package kg.megacom.natvdbdemo.controllers.v1;

import kg.megacom.natvdbdemo.controllers.BaseCrudController;
import kg.megacom.natvdbdemo.models.dto.DayDto;

import java.util.List;

public class DayController implements BaseCrudController<DayDto,Long> {
    @Override
    public DayDto save(DayDto dayDto) {
        return null;
    }

    @Override
    public DayDto update(DayDto dayDto) {
        return null;
    }

    @Override
    public List<DayDto> findAll() {
        return null;
    }

    @Override
    public DayDto findById(Long id) {
        return null;
    }
}
