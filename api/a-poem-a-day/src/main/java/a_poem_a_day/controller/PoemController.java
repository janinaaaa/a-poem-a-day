package a_poem_a_day.controller;

import a_poem_a_day.model.Poem;
import a_poem_a_day.service.poem.PoemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/poem")
@RequiredArgsConstructor
public class PoemController {
    private final PoemService poemService;
    @GetMapping("/{id}")
    public ResponseEntity<Poem> getPoemById(@PathVariable String id) {
        return poemService.getPoemById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/title/{title}")
    public ResponseEntity<Poem> getPoemByTitle(@PathVariable String title) {
        return poemService.getPoemByTitle(title)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Poem>> getRandPoems(int n) {
        return poemService.getRandPoems(n)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/author/{author}")
    public ResponseEntity<List<Poem>> getPoemByAuthor(@PathVariable String author) {
        return poemService.getPoemByAuthor(author)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }


}
