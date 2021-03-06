package kg.megacom.natvdbdemo.mappers;

import kg.megacom.natvdbdemo.models.Channel;
import kg.megacom.natvdbdemo.models.dto.ChannelDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ChannelMapper {
    ChannelMapper INSTANCE = Mappers.getMapper(ChannelMapper.class);

    Channel toChannel(ChannelDto channelDto);
    ChannelDto toChannelDto(Channel channel);

    List<Channel> toChannels(List<ChannelDto> channelDtos);
    List<ChannelDto> toChannelsDtos(List<Channel> channels);

}
