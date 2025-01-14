package a_poem_a_day.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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


}
