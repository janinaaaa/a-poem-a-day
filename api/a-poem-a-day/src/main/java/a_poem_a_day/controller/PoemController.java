package a_poem_a_day.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/poem")
public class PoemController {
    @GetMapping("/{id}")
    public String getPoemById(@PathVariable String id) {
        return "Poem with id " + id;
    }
}
