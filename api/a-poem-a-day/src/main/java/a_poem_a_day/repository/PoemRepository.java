package a_poem_a_day.repository;

import a_poem_a_day.model.Poem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PoemRepository extends JpaRepository<Poem, String> {

}
