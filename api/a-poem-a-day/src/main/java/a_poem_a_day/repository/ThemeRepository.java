package a_poem_a_day.repository;

import a_poem_a_day.model.Theme;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface ThemeRepository extends JpaRepository<Theme, String> {

    Optional<List<Theme>> findByThemeDate(Date date);

    Optional<List<Theme>> findByThemeDateBetween(Date startDate, Date endDate);

    Optional<List<Theme>> findByThemeDateMonth(int month);
}
