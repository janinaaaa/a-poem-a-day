package a_poem_a_day.service.theme;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import a_poem_a_day.dto.theme.AddThemeRequest;
import a_poem_a_day.dto.theme.ThemeDTO;
import a_poem_a_day.dto.theme.UpdateThemeRequest;
import a_poem_a_day.model.Theme;

public interface ThemeService {
     ThemeDTO getThemeById(String id);

     List<ThemeDTO> getThemesByDate(Date date);

     List<ThemeDTO> getThemesByDateRange(Date startDate, Date endDate);

     List<ThemeDTO> getThemesByMonth(int month);
     Theme addTheme(AddThemeRequest theme);
     Theme updateTheme(UpdateThemeRequest theme);


}
