package kg.megacom.natvdbdemo.models.dto;

import kg.megacom.natvdbdemo.models.Channel;
import lombok.Data;

import java.util.Date;
@Data
public class PriceDto {
    private Long id;
    private Channel channel;
    private Date startDate;
    private Date endDate;
    private double price;
}
