package kg.megacom.natvdbdemo.controllers.v1;

import kg.megacom.natvdbdemo.models.dto.ChannelDto;
import kg.megacom.natvdbdemo.models.toFrontEnd.Output;
import kg.megacom.natvdbdemo.services.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/v1/channel")
public class ChannelController  {
    @Autowired
    ChannelService channelService;

    @PostMapping("/save")
    ChannelDto save(@RequestBody ChannelDto channelDto){
        return channelService.save(channelDto);
    }
//    @GetMapping("/getAll")
//    List<ChannelDiscountPriceDto> outputs(){
//        return channelService.outputChannels();
//    }
    @GetMapping("/getAll")
    List<Output> outputs () {
        return channelService.outPutChannels();

    }

}
