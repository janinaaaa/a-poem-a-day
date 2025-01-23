package a_poem_a_day.service.poem;

import a_poem_a_day.dto.poem.AddPoemRequest;
import a_poem_a_day.dto.poem.UpdatePoemRequest;
import a_poem_a_day.model.Poem;

import java.util.List;
import java.util.Optional;


public interface PoemService {
    Optional<Poem> getPoemById(String id);
    Optional<Poem> getPoemByTitle(String title);
    Optional<List<Poem>> getPoemByAuthor(String author);
    Optional<List<Poem>> getRandPoems(int n);
    public Poem addPoem(AddPoemRequest poem);
    public Poem updatePoem(UpdatePoemRequest poem);
    public void deletePoem(String id);



}
