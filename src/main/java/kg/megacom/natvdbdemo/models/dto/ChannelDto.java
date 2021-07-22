package kg.megacom.natvdbdemo.models.dto;

import lombok.Data;

@Data
public class ChannelDto {
    private Long id;
    private String name;
    private String photo;
    private boolean active;
    private int order_num;
}
