package entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Time;

public class FilmEntityPK implements Serializable {

    private String tytul;
    private Time rokProdukcji;

    @Column(name = "TYTUL")
    @Id
    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    @Column(name = "ROK_PRODUKCJI")
    @Id
    public Time getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(Time rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        FilmEntityPK that = (FilmEntityPK)o;

        if(tytul != null ? !tytul.equals(that.tytul) : that.tytul != null) return false;
        if(rokProdukcji != null ? !rokProdukcji.equals(that.rokProdukcji) : that.rokProdukcji != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tytul != null ? tytul.hashCode() : 0;
        result = 31 * result + (rokProdukcji != null ? rokProdukcji.hashCode() : 0);
        return result;
    }

}
