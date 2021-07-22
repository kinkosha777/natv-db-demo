package kg.megacom.natvdbdemo.dao;

import kg.megacom.natvdbdemo.models.Channel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChannelRepository extends JpaRepository<Channel, Long> {

}
