package kg.megacom.natvdbdemo.dao;

import kg.megacom.natvdbdemo.models.Order;
import kg.megacom.natvdbdemo.models.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {
    List<OrderDetail> findAllByOrder(Order order);
    @Query(value = "select * from order_details od where od.id_orders = ?1", nativeQuery = true)
    List<OrderDetail> findByOrderId(Long id);
}
