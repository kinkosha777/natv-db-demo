package kg.megacom.natvdbdemo.dao;

import kg.megacom.natvdbdemo.models.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<Long, OrderDetail> {
}
