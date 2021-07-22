package kg.megacom.natvdbdemo.models.dto;

import lombok.Data;
@Data
public class OrderDetailDto {
    private Long id;
    private ChannelDto channelDto;
    private OrderDto orderDto;
    private double price;
}
