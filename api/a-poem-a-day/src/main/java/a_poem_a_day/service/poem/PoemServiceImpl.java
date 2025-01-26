package a_poem_a_day.service.poem;

import a_poem_a_day.dto.poem.AddPoemRequest;
import a_poem_a_day.dto.poem.PoemDTO;
import a_poem_a_day.dto.poem.UpdatePoemRequest;
import a_poem_a_day.mapper.PoemMapper;
import a_poem_a_day.model.Poem;
import a_poem_a_day.repository.PoemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PoemServiceImpl implements PoemService{
    private final PoemRepository poemRepository;
    private final PoemMapper poemMapper;

    @Override
    public PoemDTO getPoemById(String id) {
        Optional<Poem> poem = poemRepository.findById(id);
        return poem.map(poemMapper::toPoemDTO).orElse(null);
    }

    @Override
    public PoemDTO getPoemByTitle(String title) {
        Optional<Poem> poem = poemRepository.findByTitle(title);
        return poem.map(poemMapper::toPoemDTO).orElse(null);
    }

    @Override
    public List<PoemDTO> getPoemByAuthor(String author) {
        List<Poem> poems = poemRepository.findByAuthor(author);
        return poems.stream()
                .map(poemMapper::toPoemDTO)
                .collect(Collectors.toList());

    }

    @Override
    public List<Poem> getRandPoems(int n) {
        List<Poem> poems = poemRepository.findAll();
        // If there are less than n poems, return all poems
        if(poems.size() < n){
            return poems;
        }
        // shuffle poems
        for(int i = 0; i < poems.size(); i++){
            int randIndex = (int) (Math.random() * poems.size());
            Poem temp = poems.get(i);
            poems.set(i, poems.get(randIndex));
            poems.set(randIndex, temp);
        }
        return poems.subList(0, n);
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
