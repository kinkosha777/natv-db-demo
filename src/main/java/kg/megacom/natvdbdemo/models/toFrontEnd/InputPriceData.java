package kg.megacom.natvdbdemo.models.toFrontEnd;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class InputPriceData {

    private Long channelId;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    private Date startDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    private Date endDate;
    private double price;
}
