package kg.megacom.natvdbdemo.models;

import kg.megacom.natvdbdemo.enums.OrderStatus;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;
    private String name;
    private String phone;
    private String email;
    private double totalPrice;
    private Date editDate;
    private Date addDate;
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;
}
