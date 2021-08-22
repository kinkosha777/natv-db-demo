package kg.megacom.natvdbdemo.controllers.v1;

import kg.megacom.natvdbdemo.models.dto.DiscountDto;
import kg.megacom.natvdbdemo.models.toFrontEnd.InputDiscountData;
import kg.megacom.natvdbdemo.services.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("api/v1/discount")
public class DiscountController  {
    @Autowired
    private DiscountService discountService;

    @PostMapping("/save-discount")

    public DiscountDto saveNewDiscountForChannel(@RequestBody InputDiscountData inputDiscountData){
        System.out.println(inputDiscountData);
        return discountService.saveNewDiscountForChannel(inputDiscountData);
    }


}
