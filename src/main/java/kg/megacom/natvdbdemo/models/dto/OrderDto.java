package kg.megacom.natvdbdemo.models.dto;

import kg.megacom.natvdbdemo.enums.OrderStatus;
import lombok.Data;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Date;
@Data
public class OrderDto {
    private Long id;
    private String text;
    private String name;
    private String phone;
    private String email;
    private double totalPrice;
    private Date editDate;
    private Date addDate;
    private OrderStatus orderStatus;
}
