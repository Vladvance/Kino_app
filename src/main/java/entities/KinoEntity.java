package entities;

import javax.persistence.*;

@Entity
@Table(name = "KINO", schema = "INF136573")
public class KinoEntity {

    private String nazwa;
    private String adres;

    @Id
    @Column(name = "NAZWA")
    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Basic
    @Column(name = "ADRES")
    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        KinoEntity that = (KinoEntity)o;

        if(nazwa != null ? !nazwa.equals(that.nazwa) : that.nazwa != null) return false;
        if(adres != null ? !adres.equals(that.adres) : that.adres != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nazwa != null ? nazwa.hashCode() : 0;
        result = 31 * result + (adres != null ? adres.hashCode() : 0);
        return result;
    }

}
