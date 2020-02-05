package entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class SalaEntityPK implements Serializable {

    private long nrSali;
    private String kinoNazwa;

    @Column(name = "NR_SALI")
    @Id
    public long getNrSali() {
        return nrSali;
    }

    public void setNrSali(long nrSali) {
        this.nrSali = nrSali;
    }

    @Column(name = "KINO_NAZWA")
    @Id
    public String getKinoNazwa() {
        return kinoNazwa;
    }

    public void setKinoNazwa(String kinoNazwa) {
        this.kinoNazwa = kinoNazwa;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        SalaEntityPK that = (SalaEntityPK)o;

        if(nrSali != that.nrSali) return false;
        if(kinoNazwa != null ? !kinoNazwa.equals(that.kinoNazwa) : that.kinoNazwa != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int)(nrSali ^ (nrSali >>> 32));
        result = 31 * result + (kinoNazwa != null ? kinoNazwa.hashCode() : 0);
        return result;
    }

}
