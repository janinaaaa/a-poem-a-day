package a_poem_a_day.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "theme")

public class Theme {
    @Id
    @GeneratedValue(generator = "uuid")
    private String id;

    private String name;
    private Date themeDate;
}
