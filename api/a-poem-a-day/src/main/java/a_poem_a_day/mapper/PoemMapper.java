package a_poem_a_day.mapper;

import a_poem_a_day.dto.poem.AddPoemRequest;
import a_poem_a_day.dto.poem.PoemDTO;
import a_poem_a_day.dto.poem.UpdatePoemRequest;
import a_poem_a_day.model.Poem;

public class PoemMapper {
    public Poem toPoem(AddPoemRequest addPoemRequest) {
        Poem poem = new Poem();
        poem.setTitle(addPoemRequest.getTitle());
        poem.setAuthor(addPoemRequest.getAuthor());
        poem.setContent(addPoemRequest.getContent());
        return poem;
    }

    public Poem toPoem(UpdatePoemRequest updatePoemRequest) {
        Poem poem = new Poem();
        poem.setTitle(updatePoemRequest.getTitle());
        poem.setAuthor(updatePoemRequest.getAuthor());
        poem.setContent(updatePoemRequest.getContent());
        return poem;
    }

    public PoemDTO toPoemDTO(Poem poem) {
        PoemDTO poemDTO = new PoemDTO();
        poemDTO.setId(poem.getId());
        poemDTO.setTitle(poem.getTitle());
        poemDTO.setAuthor(poem.getAuthor());
        poemDTO.setContent(poem.getContent());
        return poemDTO;
    }

    public Poem toPoem(PoemDTO updatePoemRequest) {
        Poem poem = new Poem();
        poem.setTitle(updatePoemRequest.getTitle());
        poem.setAuthor(updatePoemRequest.getAuthor());
        poem.setContent(updatePoemRequest.getContent());
        return poem;
    }
}
