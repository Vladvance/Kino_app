package entities;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "FILM", schema = "INF136573")
@IdClass(FilmEntityPK.class)
public class FilmEntity {

    private String tytul;
    private Time rokProdukcji;
    private String dlugosc;

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
    public Time getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(Time rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    @Basic
    @Column(name = "DLUGOSC")
    public String getDlugosc() {
        return dlugosc;
    }

    public void setDlugosc(String dlugosc) { this.dlugosc = dlugosc; }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        FilmEntity that = (FilmEntity)o;

        if(tytul != null ? !tytul.equals(that.tytul) : that.tytul != null) return false;
        if(rokProdukcji != null ? !rokProdukcji.equals(that.rokProdukcji) : that.rokProdukcji != null) return false;
        if(dlugosc != null ? !dlugosc.equals(that.dlugosc) : that.dlugosc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tytul != null ? tytul.hashCode() : 0;
        result = 31 * result + (rokProdukcji != null ? rokProdukcji.hashCode() : 0);
        result = 31 * result + (dlugosc != null ? dlugosc.hashCode() : 0);
        return result;
    }

}
