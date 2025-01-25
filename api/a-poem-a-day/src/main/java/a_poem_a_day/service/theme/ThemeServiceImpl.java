package a_poem_a_day.service.theme;

import a_poem_a_day.dto.theme.AddThemeRequest;
import a_poem_a_day.dto.theme.UpdateThemeRequest;
import a_poem_a_day.model.Theme;
import a_poem_a_day.repository.ThemeRepository;
import a_poem_a_day.mapper.ThemeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ThemeServiceImpl implements ThemeService{
    private final ThemeRepository themeRepository;
    private final ThemeMapper themeMapper;

    @Override
    public Optional<Theme> getThemeById(String id) {
        return themeRepository.findById(id);
    }

    @Override
    public Optional<List<Theme>> getThemesByDate(Date date) {
        return themeRepository.findByThemeDate(date);
    }

    @Override
    public Optional<List<Theme>> getThemesByDateRange(Date startDate, Date endDate) {
        return themeRepository.findByThemeDateBetween(startDate, endDate);
    }

    @Override
    public Optional<List<Theme>> getThemesByMonth(int month) {
        return themeRepository.findByThemeDateMonth(month);
    }

    @Override
    public Theme addTheme(AddThemeRequest theme) {
        Theme newTheme = themeMapper.toTheme(theme);
        return themeRepository.save(newTheme);
    }

    @Override
    public Theme updateTheme(UpdateThemeRequest theme) {
        Theme newTheme = themeMapper.toTheme(theme);
        return themeRepository.save(newTheme);
    }
}
