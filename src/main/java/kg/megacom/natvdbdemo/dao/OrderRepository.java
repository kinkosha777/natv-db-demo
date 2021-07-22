package kg.megacom.natvdbdemo.dao;

import kg.megacom.natvdbdemo.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Long, Order> {
}
