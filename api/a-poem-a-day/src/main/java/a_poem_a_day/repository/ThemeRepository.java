package a_poem_a_day.repository;

import a_poem_a_day.model.Theme;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ThemeRepository extends JpaRepository<Theme, String> {

    List<Theme> findByThemeDate(Date date);

    List<Theme> findByThemeDateBetween(Date startDate, Date endDate);

    List<Theme> findByThemeDateMonth(int month);
}
