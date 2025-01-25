package a_poem_a_day.service.theme;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import a_poem_a_day.dto.theme.AddThemeRequest;
import a_poem_a_day.dto.theme.UpdateThemeRequest;
import a_poem_a_day.model.Theme;

public interface ThemeService {
     Optional<Theme> getThemeById(String id);

     Optional<List<Theme>> getThemesByDate(Date date);

     Optional<List<Theme>> getThemesByDateRange(Date startDate, Date endDate);

     Optional<List<Theme>> getThemesByMonth(int month);
     Theme addTheme(AddThemeRequest theme);
     Theme updateTheme(UpdateThemeRequest theme);


}
