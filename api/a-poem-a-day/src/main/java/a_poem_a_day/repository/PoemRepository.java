package a_poem_a_day.repository;

import a_poem_a_day.model.Poem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PoemRepository extends JpaRepository<Poem, String> {

    Optional<Poem> findByTitle(String title);

    Optional<Poem> findByAuthor(String author);
}

