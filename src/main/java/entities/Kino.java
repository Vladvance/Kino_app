package entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Kino {

    private String nazwa;
    private String adres;
    private Collection<Sala> salasByNazwa;

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

        Kino kino = (Kino)o;

        if(nazwa != null ? !nazwa.equals(kino.nazwa) : kino.nazwa != null) return false;
        if(adres != null ? !adres.equals(kino.adres) : kino.adres != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nazwa != null ? nazwa.hashCode() : 0;
        result = 31 * result + (adres != null ? adres.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "kinoByKinoNazwa")
    public Collection<Sala> getSalasByNazwa() {
        return salasByNazwa;
    }

    public void setSalasByNazwa(Collection<Sala> salasByNazwa) {
        this.salasByNazwa = salasByNazwa;
    }

}
