package a_poem_a_day.mapper;

import a_poem_a_day.dto.theme.AddThemeRequest;
import a_poem_a_day.dto.theme.ThemeDTO;
import a_poem_a_day.dto.theme.UpdateThemeRequest;
import a_poem_a_day.model.Theme;

public class ThemeMapper {
    public Theme toTheme(AddThemeRequest addThemeRequest) {
        Theme theme = new Theme();
        theme.setName(addThemeRequest.getName());
        return theme;
    }

    public ThemeDTO toThemeDTO(Theme theme) {
        ThemeDTO themeDTO = new ThemeDTO();
        themeDTO.setId(theme.getId());
        themeDTO.setName(theme.getName());
        themeDTO.setThemeDate(theme.getThemeDate());
        return themeDTO;
    }

    public Theme toTheme(ThemeDTO themeDTO) {
        Theme theme = new Theme();
        theme.setName(themeDTO.getName());
        theme.setThemeDate(themeDTO.getThemeDate());
        return theme;
    }

    public Theme toTheme(UpdateThemeRequest updateThemeRequest) {
        Theme theme = new Theme();
        theme.setName(updateThemeRequest.getName());
        return theme;
    }



}
