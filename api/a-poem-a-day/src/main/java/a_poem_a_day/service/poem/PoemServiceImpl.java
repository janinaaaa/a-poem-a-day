package a_poem_a_day.service.poem;

import a_poem_a_day.dto.poem.AddPoemRequest;
import a_poem_a_day.dto.poem.UpdatePoemRequest;
import a_poem_a_day.mapper.PoemMapper;
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
    private final PoemMapper poemMapper;

    @Override
    public Optional<Poem> getPoemById(String id) {
        return poemRepository.findById(id);
    }

    @Override
    public Optional<Poem> getPoemByTitle(String title) {
        return poemRepository.findByTitle(title);
    }

    @Override
    public Optional<List<Poem>> getPoemByAuthor(String author) {
        return poemRepository.findByAuthor(author);
    }

    @Override
    public Optional<List<Poem>> getRandPoems(int n) {
        List<Poem> poems = poemRepository.findAll();
        if(poems.size() < n){
            return poems.isEmpty() ? Optional.empty() : Optional.of(poems);
        }
        // shuffle poems
        for(int i = 0; i < poems.size(); i++){
            int randIndex = (int) (Math.random() * poems.size());
            Poem temp = poems.get(i);
            poems.set(i, poems.get(randIndex));
            poems.set(randIndex, temp);
        }
        return Optional.of(poems.subList(0, n));
    }

    @Override
    public Poem addPoem(AddPoemRequest poem) {
        Poem newPoem = poemMapper.toPoem(poem);
        return poemRepository.save(newPoem);
    }

    @Override
    public Poem updatePoem(UpdatePoemRequest poem) {
        Poem newPoem = poemMapper.toPoem(poem);
        return poemRepository.save(newPoem);
    }

    @Override
    public void deletePoem(String id) {
        poemRepository.deleteById(id);
    }
}
