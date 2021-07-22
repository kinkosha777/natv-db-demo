package kg.megacom.natvdbdemo.dao;

import kg.megacom.natvdbdemo.models.Channel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChannelRepository extends JpaRepository<Long, Channel> {

}
