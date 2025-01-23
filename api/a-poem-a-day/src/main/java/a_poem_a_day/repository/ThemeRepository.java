package a_poem_a_day.repository;

import a_poem_a_day.model.Theme;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ThemeRepository extends JpaRepository<Theme, String> {

}
