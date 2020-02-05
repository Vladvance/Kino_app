package entities;

import javax.persistence.*;

@Entity
@Table(name = "REZYSER", schema = "INF136573")
@IdClass(RezyserEntityPK.class)
public class RezyserEntity {

    private String imie;
    private String nazwisko;

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

        RezyserEntity that = (RezyserEntity)o;

        if(imie != null ? !imie.equals(that.imie) : that.imie != null) return false;
        if(nazwisko != null ? !nazwisko.equals(that.nazwisko) : that.nazwisko != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = imie != null ? imie.hashCode() : 0;
        result = 31 * result + (nazwisko != null ? nazwisko.hashCode() : 0);
        return result;
    }

}
