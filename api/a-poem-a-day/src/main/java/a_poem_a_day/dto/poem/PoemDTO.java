package a_poem_a_day.dto.poem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PoemDTO {
    private String id;

    private String title;
    private String author;
    private String content;
    private String themeId;

}
