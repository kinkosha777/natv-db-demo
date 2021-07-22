package kg.megacom.natvdbdemo.dao;

import kg.megacom.natvdbdemo.models.Discount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscountRepository extends JpaRepository<Long, Discount> {
}
