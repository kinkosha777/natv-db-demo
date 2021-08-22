package kg.megacom.natvdbdemo.dao;

import kg.megacom.natvdbdemo.models.Discount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiscountRepository extends JpaRepository<Discount, Long> {
    @Query(value = "SELECT * FROM discounts ds WHERE ds.id_channels = ?1 AND CURRENT_TIMESTAMP BETWEEN start_date AND end_date order by min_days asc", nativeQuery = true)
    List<Discount> allActiveChannelDiscounts(Long id);

    @Query(value = "select * from discounts d where d.min_days = (select MAX(min_days) from discounts d where d.min_days <= ?1) and current_timestamp between start_date and end_date and d.id_channels = ?2", nativeQuery = true)
    Discount findByTvChannelAndMinDay(int days, Long id);
}
