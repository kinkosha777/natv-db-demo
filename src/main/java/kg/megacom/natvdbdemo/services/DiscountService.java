package kg.megacom.natvdbdemo.services;

import kg.megacom.natvdbdemo.models.Discount;
import kg.megacom.natvdbdemo.models.dto.DiscountDto;
import kg.megacom.natvdbdemo.models.toFrontEnd.DiscountData;
import kg.megacom.natvdbdemo.models.toFrontEnd.InputDiscountData;

import java.util.List;

public interface DiscountService {
    DiscountDto saveNewDiscountForChannel(InputDiscountData inputDiscountData);
    List<DiscountDto> allActiveChannelDiscounts(Long id);
    DiscountDto findByChannelAndMinDay(int days,Long id);
}
