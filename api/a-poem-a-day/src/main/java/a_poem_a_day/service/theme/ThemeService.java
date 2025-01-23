package a_poem_a_day.service.theme;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import a_poem_a_day.model.Theme;

public interface ThemeService {
    public Optional<Theme> getThemeById(String id);

    public Optional<List<Theme>> getThemesByDate(Date date);

    public Optional<List<Theme>> getThemesByDateRange(Date startDate, Date endDate);

    public Optional<List<Theme>> getThemesByMonth(int month);
    public Theme addTheme(Theme theme);
    public Theme updateTheme(Theme theme);


}
