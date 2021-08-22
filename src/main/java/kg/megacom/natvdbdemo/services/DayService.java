package kg.megacom.natvdbdemo.services;

import kg.megacom.natvdbdemo.models.dto.OrderDetailDto;
import kg.megacom.natvdbdemo.models.toFrontEnd.InputChannelData;

import java.util.Date;

public interface DayService  {

    void save(Date date, OrderDetailDto orderDetailDto);
}
