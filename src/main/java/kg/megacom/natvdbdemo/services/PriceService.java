package kg.megacom.natvdbdemo.services;

import kg.megacom.natvdbdemo.models.dto.PriceDto;
import kg.megacom.natvdbdemo.models.toFrontEnd.InputPriceData;

import java.util.List;

public interface PriceService {

    PriceDto savePriceForChannel(InputPriceData inputPriceData);
    List<PriceDto> allActiveChannelsPrice();
    PriceDto findByChannelAndDate(Long id);
}
