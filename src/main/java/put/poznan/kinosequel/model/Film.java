package put.poznan.kinosequel.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@IdClass(FilmPK.class)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Film {

    @Id
    @Column(name = "TYTUL")
    private String title;

    @Id
    @Column(name = "ROK_PRODUKCJI")
    private String productionYear;

    @Basic
    @Column(name = "DLUGOSC")
    private String duration;

    //TODO: usuwanie filmu nie powinno usuwać rezysera (teraz nie tak)
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumns({@JoinColumn(name = "REZYSER_IMIE", referencedColumnName = "IMIE", nullable = false), @JoinColumn(name = "REZYSER_NAZWISKO", referencedColumnName = "NAZWISKO", nullable = false)})
    private Director director;
}
