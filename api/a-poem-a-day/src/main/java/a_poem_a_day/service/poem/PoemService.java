package a_poem_a_day.service.poem;

import a_poem_a_day.dto.poem.AddPoemRequest;
import a_poem_a_day.dto.poem.PoemDTO;
import a_poem_a_day.dto.poem.UpdatePoemRequest;
import a_poem_a_day.model.Poem;

import java.util.List;


public interface PoemService {
    PoemDTO getPoemById(String id);
    PoemDTO getPoemByTitle(String title);
    List<PoemDTO> getPoemByAuthor(String author);
    List<PoemDTO> getRandPoems(int n);
    Poem addPoem(AddPoemRequest poem);
    Poem updatePoem(UpdatePoemRequest poem);
    void deletePoem(String id);



}
