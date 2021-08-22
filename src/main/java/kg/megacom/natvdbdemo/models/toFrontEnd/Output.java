package kg.megacom.natvdbdemo.models.toFrontEnd;

import kg.megacom.natvdbdemo.models.Discount;
import lombok.Data;

import java.util.List;
@Data
public class Output {
    private Long id;
    private String ChannelName;
    private String image;
    private double price;
    private List<DiscountData> discountsData;

}
