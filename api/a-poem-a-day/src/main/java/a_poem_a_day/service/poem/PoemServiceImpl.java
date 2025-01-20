package a_poem_a_day.service.poem;

import a_poem_a_day.model.Poem;
import a_poem_a_day.repository.PoemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PoemServiceImpl implements PoemService{
    private final PoemRepository poemRepository;

    @Override
    public Optional<Poem> getPoemById(String id) {
        return poemRepository.findById(id);
    }

    @Override
    public Optional<Poem> getPoemByTitle(String title) {
        return poemRepository.findByTitle(title);
    }

    @Override
    public Optional<Poem> getPoemByAuthor(String author) {
        return poemRepository.findByAuthor(author);
    }

    @Override
    public Optional<List<Poem>> getRandPoems(int n) {
        return Optional.empty();
    }
}
