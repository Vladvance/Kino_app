package put.poznan.kinosequel.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FilmPK implements Serializable {

    @Id
    @Column(name = "TYTUL")
    private String title;

    @Id
    @Column(name = "ROK_PRODUKCJI")
    private String productionYear;
}
