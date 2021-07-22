package kg.megacom.natvdbdemo.dao;

import kg.megacom.natvdbdemo.models.Price;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository extends JpaRepository<Long, Price> {
}
