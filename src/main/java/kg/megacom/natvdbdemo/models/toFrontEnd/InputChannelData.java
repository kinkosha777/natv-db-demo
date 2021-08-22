package kg.megacom.natvdbdemo.models.toFrontEnd;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
import java.util.List;
@Data
public class InputChannelData {
    private Long channelId;
    private double price;
    @JsonFormat(shape = JsonFormat.Shape.ARRAY, pattern="dd-MM-yyyy")
    private List<Date> days;
}
