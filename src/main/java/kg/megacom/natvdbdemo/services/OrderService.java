package kg.megacom.natvdbdemo.services;

import kg.megacom.natvdbdemo.models.dto.OrderDto;
import kg.megacom.natvdbdemo.models.toFrontEnd.InputChannelData;
import kg.megacom.natvdbdemo.models.toFrontEnd.InputOrderData;

public interface OrderService {

   InputOrderData save(InputOrderData inputOrderData);
}
