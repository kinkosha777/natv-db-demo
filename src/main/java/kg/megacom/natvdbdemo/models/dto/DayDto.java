package kg.megacom.natvdbdemo.models.dto;

import kg.megacom.natvdbdemo.models.OrderDetail;
import lombok.Data;

import java.util.Date;
@Data
public class DayDto {
    private Long id;
    private OrderDetail orderDetail;
    private Date day;
}
