package a_poem_a_day.controller;

import a_poem_a_day.dto.theme.AddThemeRequest;
import a_poem_a_day.dto.theme.ThemeDTO;
import a_poem_a_day.dto.theme.UpdateThemeRequest;
import a_poem_a_day.model.Theme;
import a_poem_a_day.service.theme.ThemeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/date/{startDate}/{endDate}")
    public ResponseEntity<List<ThemeDTO>> getThemeByDateRange(@PathVariable Date startDate, @PathVariable Date endDate) {
        return ResponseEntity.ok(themeService.getThemesByDateRange(startDate, endDate));
    }

    @GetMapping("/month/{month}")
    public ResponseEntity<List<ThemeDTO>> getThemeByMonth(@PathVariable int month) {
        return ResponseEntity.ok(themeService.getThemesByMonth(month));
    }

    @PostMapping("/add")
    public ResponseEntity<Theme> addTheme(@Valid @RequestBody AddThemeRequest theme) {
        return ResponseEntity.ok(themeService.addTheme(theme));
    }

    @PutMapping("/update")
    public ResponseEntity<Theme> updateTheme(@Valid @RequestBody UpdateThemeRequest theme) {
        return ResponseEntity.ok(themeService.updateTheme(theme));
    }

}
