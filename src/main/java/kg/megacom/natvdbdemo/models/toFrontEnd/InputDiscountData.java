package kg.megacom.natvdbdemo.models.toFrontEnd;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
@Data
public class InputDiscountData {
    private Long channelId;
    private double percent;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    private Date startDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    private Date endDate;
    private int minDays;

}
