package entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class RezyserPK implements Serializable {

    private String imie;
    private String nazwisko;

    @Column(name = "IMIE")
    @Id
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    @Column(name = "NAZWISKO")
    @Id
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

        RezyserPK rezyserPK = (RezyserPK)o;

        if(imie != null ? !imie.equals(rezyserPK.imie) : rezyserPK.imie != null) return false;
        if(nazwisko != null ? !nazwisko.equals(rezyserPK.nazwisko) : rezyserPK.nazwisko != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = imie != null ? imie.hashCode() : 0;
        result = 31 * result + (nazwisko != null ? nazwisko.hashCode() : 0);
        return result;
    }

}
