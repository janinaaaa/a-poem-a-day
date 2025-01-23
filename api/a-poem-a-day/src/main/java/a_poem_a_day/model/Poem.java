package a_poem_a_day.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "poem")
public class Poem {
    @Id
    @GeneratedValue(generator = "uuid")
    private String id;

    private String title;
    private String author;
    private String content;

    @ManyToOne
    @JoinColumn(name="theme_id", referencedColumnName = "id")
    private Theme theme;



}
