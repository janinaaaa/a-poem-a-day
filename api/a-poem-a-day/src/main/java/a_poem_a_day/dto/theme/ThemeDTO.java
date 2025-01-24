package a_poem_a_day.dto.theme;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ThemeDTO {
    private String id;
    private String name;
    private Date themeDate;
}
