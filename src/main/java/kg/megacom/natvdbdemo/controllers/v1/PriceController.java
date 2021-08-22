package kg.megacom.natvdbdemo.controllers.v1;

import kg.megacom.natvdbdemo.controllers.BaseCrudController;
import kg.megacom.natvdbdemo.models.dto.PriceDto;
import kg.megacom.natvdbdemo.models.toFrontEnd.InputPriceData;
import kg.megacom.natvdbdemo.services.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/v1/price")
public class PriceController  {
    @Autowired
    PriceService priceService;
    @PostMapping("/save-price")
    public PriceDto savePriceForChannel(@RequestBody InputPriceData inputPriceData){
        System.out.println(inputPriceData);
        return priceService.savePriceForChannel(inputPriceData);
    }

}
