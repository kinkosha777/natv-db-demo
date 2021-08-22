package kg.megacom.natvdbdemo.models.toFrontEnd;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class DiscountData {
    private int minDays;
    private double percent;
}
