package kg.megacom.natvdbdemo.models.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
@Data
public class DiscountDto {
    private Long id;
    private ChannelDto channel;
    private double percent;
    private Long channelId;
    @JsonFormat(shape = JsonFormat.Shape.ARRAY, pattern="dd-MM-yyyy")
    private Date startDate;
    @JsonFormat(shape = JsonFormat.Shape.ARRAY, pattern="dd-MM-yyyy")
    private Date endDate;
    private int mindDays;
}
