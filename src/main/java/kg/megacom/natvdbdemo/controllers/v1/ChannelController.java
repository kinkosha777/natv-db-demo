package kg.megacom.natvdbdemo.controllers.v1;

import kg.megacom.natvdbdemo.controllers.BaseCrudController;
import kg.megacom.natvdbdemo.models.dto.ChannelDto;
import kg.megacom.natvdbdemo.services.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("api/v1/channel")
public class ChannelController implements BaseCrudController<ChannelDto,Long> {
    @Autowired
    ChannelService channelService;
    @Override
    public ChannelDto save(ChannelDto channelDto) {
        return channelService.save(channelDto);
    }

    @Override
    public ChannelDto update(ChannelDto channelDto) {
        return channelService.update(channelDto);
    }

    @Override
    public List<ChannelDto> findAll() {
        return channelService.findAll();
    }

    @Override
    public ChannelDto findById(Long id) {
        return channelService.findById(id);
    }
}
