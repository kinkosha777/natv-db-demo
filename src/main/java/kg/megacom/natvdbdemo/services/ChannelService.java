package kg.megacom.natvdbdemo.services;

import kg.megacom.natvdbdemo.models.dto.ChannelDto;
import kg.megacom.natvdbdemo.models.toFrontEnd.Output;

import java.util.List;

public interface ChannelService  {
//    ChannelDiscountPriceDto saveNewEmpDiscPrice(ChannelDiscountPriceDto channelDiscountPriceDto);
//    List<ChannelDiscountPriceDto> outputChannels();
    ChannelDto save(ChannelDto channelDto);
    ChannelDto findChanelByIdForDiscount(Long id);
    ChannelDto findById(Long id);
    List<Output> outPutChannels();
}
