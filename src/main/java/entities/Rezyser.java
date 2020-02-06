package entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
@IdClass(RezyserPK.class)
public class Rezyser {

    private String imie;
    private String nazwisko;
    private Collection<Film> films;

    @Id
    @Column(name = "IMIE")
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    @Id
    @Column(name = "NAZWISKO")
    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        Rezyser rezyser = (Rezyser)o;

        if(imie != null ? !imie.equals(rezyser.imie) : rezyser.imie != null) return false;
        if(nazwisko != null ? !nazwisko.equals(rezyser.nazwisko) : rezyser.nazwisko != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = imie != null ? imie.hashCode() : 0;
        result = 31 * result + (nazwisko != null ? nazwisko.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "rezyser")
    public Collection<Film> getFilms() {
        return films;
    }

    public void setFilms(Collection<Film> films) {
        this.films = films;
    }

    @Override
    public String toString() {
        return "Rezyser{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", films=" + films +
                '}';
    }

}
