package kg.megacom.natvdbdemo.models.dto;

import kg.megacom.natvdbdemo.models.Channel;
import lombok.Data;

import java.util.Date;
@Data
public class DiscountDto {
    private Long id;
    private ChannelDto channelDto;
    private double percent;
    private Date startDate;
    private Date endDate;
    private int mindDays;
}
