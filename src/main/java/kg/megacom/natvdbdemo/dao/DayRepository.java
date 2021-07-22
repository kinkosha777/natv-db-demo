package kg.megacom.natvdbdemo.dao;

import kg.megacom.natvdbdemo.models.Day;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DayRepository extends JpaRepository<Long, Day> {
}
