package kg.megacom.natvdbdemo.services.impl;

import kg.megacom.natvdbdemo.dao.ChannelRepository;
import kg.megacom.natvdbdemo.mappers.ChannelMapper;
import kg.megacom.natvdbdemo.models.Channel;
import kg.megacom.natvdbdemo.models.dto.ChannelDto;
import kg.megacom.natvdbdemo.services.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ChannelServiceImpl implements ChannelService {
    @Autowired
    ChannelRepository channelRepository;
    @Autowired
    ChannelMapper channelMapper;
    @Override
    public ChannelDto save(ChannelDto channelDto) {
        Channel channel = channelMapper.toChannel(channelDto);
        channel = channelRepository.save(channel);
        return channelMapper.toChannelDto(channel);
    }

    @Override
    public ChannelDto update(ChannelDto channelDto) {
        if (!channelRepository.existsById(channelDto.getId()))
            throw new RuntimeException("Канал не найден!");
        Channel channel = channelMapper.toChannel(channelDto);
        channel = channelRepository.save(channel);
        return channelMapper.toChannelDto(channel);
    }

    @Override
    public List<ChannelDto> findAll() {

        return channelMapper.toChannelsDtos(channelRepository.findAll());
    }

    @Override
    public ChannelDto findById(Long id) {
        Channel channel = channelRepository.findById(id).orElseThrow(()->new RuntimeException("Канал не найден!"));

        return channelMapper.toChannelDto(channel);
    }
}
