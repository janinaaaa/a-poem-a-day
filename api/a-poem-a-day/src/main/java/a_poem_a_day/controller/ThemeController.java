package a_poem_a_day.controller;

import a_poem_a_day.dto.theme.ThemeDTO;
import a_poem_a_day.service.theme.ThemeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController("/theme")
@RequiredArgsConstructor
public class ThemeController {
    private final ThemeService themeService;
    @GetMapping("/{id}")
    public ResponseEntity<ThemeDTO> getThemeById(@PathVariable String id) {
        return ResponseEntity.ok(themeService.getThemeById(id));
    }


    @GetMapping("/date/{date}")
    public ResponseEntity<List<ThemeDTO>> getThemeByDate(@PathVariable Date date) {
        return ResponseEntity.ok(themeService.getThemesByDate(date));
    }
}
