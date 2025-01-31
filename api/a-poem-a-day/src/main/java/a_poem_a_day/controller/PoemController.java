package a_poem_a_day.controller;

import a_poem_a_day.dto.poem.PoemDTO;
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
    public ResponseEntity<PoemDTO> getPoemById(@PathVariable String id) {
        return ResponseEntity.ok(poemService.getPoemById(id));
    }

    @GetMapping("/title/{title}")
    public ResponseEntity<PoemDTO> getPoemByTitle(@PathVariable String title) {
        return ResponseEntity.ok(poemService.getPoemByTitle(title));
    }

    @GetMapping
    public ResponseEntity<List<PoemDTO>> getRandPoems(int n) {
        return ResponseEntity.ok(poemService.getRandPoems(n));
    }

    @GetMapping("/author/{author}")
    public ResponseEntity<List<PoemDTO>> getPoemByAuthor(@PathVariable String author) {
        return ResponseEntity.ok(poemService.getPoemByAuthor(author));
    }


}
