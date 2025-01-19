package a_poem_a_day.service.poem;

import a_poem_a_day.repository.PoemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PoemServiceImpl {
    private final PoemRepository poemRepository;

}
