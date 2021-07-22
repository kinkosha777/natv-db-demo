package kg.megacom.natvdbdemo.controllers.v1;

import kg.megacom.natvdbdemo.controllers.BaseCrudController;
import kg.megacom.natvdbdemo.models.dto.DayDto;
import kg.megacom.natvdbdemo.services.DayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("api/v1/day")
public class DayController implements BaseCrudController<DayDto,Long> {
    @Autowired
    DayService dayService;
    @Override
    public DayDto save(DayDto dayDto) {
        return dayService.save(dayDto);
    }

    @Override
    public DayDto update(DayDto dayDto) {
        return dayService.save(dayDto);
    }

    @Override
    public List<DayDto> findAll() {
        return dayService.findAll();
    }

    @Override
    public DayDto findById(Long id) {
        return dayService.findById(id);
    }
}
