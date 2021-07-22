package kg.megacom.natvdbdemo.models.dto;

import kg.megacom.natvdbdemo.models.Channel;
import kg.megacom.natvdbdemo.models.Order;
import lombok.Data;
@Data
public class OrderDetailDto {
    private Long id;
    private Channel channel;
    private Order order;
    private double price;
}
