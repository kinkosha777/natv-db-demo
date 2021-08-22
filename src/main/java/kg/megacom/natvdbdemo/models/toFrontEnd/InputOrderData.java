package kg.megacom.natvdbdemo.models.toFrontEnd;

import lombok.Data;

import java.util.List;

@Data
public class InputOrderData {
    private String text;
    private String name;
    private String phone;
    private String email;
    private double totalPrice;
    private List<InputChannelData> inputChannelDataList;
}
