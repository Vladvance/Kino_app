package entities;

import javax.persistence.*;

@Entity
@IdClass(FilmPK.class)
public class Film {

    private String tytul;
    private String rokProdukcji;
    private String dlugosc;
    private Rezyser rezyser;

    @Id
    @Column(name = "TYTUL")
    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    @Id
    @Column(name = "ROK_PRODUKCJI")
    public String getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(String rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    @Basic
    @Column(name = "DLUGOSC")
    public String getDlugosc() {
        return dlugosc;
    }

    public void setDlugosc(String dlugosc) {
        this.dlugosc = dlugosc;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        Film film = (Film)o;

        if(tytul != null ? !tytul.equals(film.tytul) : film.tytul != null) return false;
        if(rokProdukcji != null ? !rokProdukcji.equals(film.rokProdukcji) : film.rokProdukcji != null) return false;
        if(dlugosc != null ? !dlugosc.equals(film.dlugosc) : film.dlugosc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tytul != null ? tytul.hashCode() : 0;
        result = 31 * result + (rokProdukcji != null ? rokProdukcji.hashCode() : 0);
        result = 31 * result + (dlugosc != null ? dlugosc.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "REZYSER_IMIE", referencedColumnName = "IMIE", nullable = false), @JoinColumn(name = "REZYSER_NAZWISKO", referencedColumnName = "NAZWISKO", nullable = false)})
    public Rezyser getRezyser() {
        return rezyser;
    }

    public void setRezyser(Rezyser rezyser) {
        this.rezyser = rezyser;
    }

    @Override
    public String toString() {
        return "Film{" +
                "tytul='" + tytul + '\'' +
                ", rokProdukcji='" + rokProdukcji + '\'' +
                ", dlugosc='" + dlugosc + '\'' +
                ", rezyser=" + rezyser +
                '}';
    }

}
