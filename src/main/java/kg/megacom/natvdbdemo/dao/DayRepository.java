package kg.megacom.natvdbdemo.dao;

import kg.megacom.natvdbdemo.models.Day;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DayRepository extends JpaRepository<Day, Long> {
}
