package kg.megacom.natvdbdemo.dao;

import kg.megacom.natvdbdemo.models.Discount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountRepository extends JpaRepository<Discount, Long> {
}
