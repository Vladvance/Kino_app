package entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class FilmPK implements Serializable {

    private String tytul;
    private String rokProdukcji;

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
    public String getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(String rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        FilmPK filmPK = (FilmPK)o;

        if(tytul != null ? !tytul.equals(filmPK.tytul) : filmPK.tytul != null) return false;
        if(rokProdukcji != null ? !rokProdukcji.equals(filmPK.rokProdukcji) : filmPK.rokProdukcji != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tytul != null ? tytul.hashCode() : 0;
        result = 31 * result + (rokProdukcji != null ? rokProdukcji.hashCode() : 0);
        return result;
    }

}
