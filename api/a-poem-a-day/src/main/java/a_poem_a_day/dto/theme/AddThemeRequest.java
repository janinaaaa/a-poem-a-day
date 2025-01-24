package a_poem_a_day.dto.theme;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AddThemeRequest {
    @NotBlank(message = "Name is required")
    private String name;
    @NotBlank(message = "Date is required")
    private Date themeDate;
}
