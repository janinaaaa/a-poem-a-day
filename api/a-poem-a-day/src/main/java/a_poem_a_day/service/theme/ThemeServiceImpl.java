package a_poem_a_day.service.theme;

import a_poem_a_day.dto.theme.AddThemeRequest;
import a_poem_a_day.dto.theme.ThemeDTO;
import a_poem_a_day.dto.theme.UpdateThemeRequest;
import a_poem_a_day.model.Theme;
import a_poem_a_day.repository.ThemeRepository;
import a_poem_a_day.mapper.ThemeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ThemeServiceImpl implements ThemeService{
    private final ThemeRepository themeRepository;
    private final ThemeMapper themeMapper;

    @Override
    public ThemeDTO getThemeById(String id) {
        ThemeDTO themeDTO = themeMapper.toThemeDTO(themeRepository.findById(id).get());
        return themeDTO;
    }

    @Override
    public List<ThemeDTO> getThemesByDate(Date date) {
        List<Theme> themes = themeRepository.findAll();
        return themes.stream()
                .map(themeMapper::toThemeDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<ThemeDTO> getThemesByDateRange(Date startDate, Date endDate) {
        List<Theme> themes = themeRepository.findByThemeDateBetween(startDate, endDate).get();
        return themes.stream()
                .map(themeMapper::toThemeDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<ThemeDTO> getThemesByMonth(int month) {
        List<Theme> themes = themeRepository.findByThemeDateMonth(month).get();
        return themes.stream()
                .map(themeMapper::toThemeDTO)
                .collect(Collectors.toList());
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
