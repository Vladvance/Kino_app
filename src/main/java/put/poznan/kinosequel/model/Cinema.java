package put.poznan.kinosequel.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "KINO", schema = "INF136573")
public class Cinema {

    private String name;
    private String adres;

    @Id
    @Column(name = "NAZWA")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        Cinema cinema = (Cinema)o;
        return Objects.equals(name, cinema.name) &&
                Objects.equals(adres, cinema.adres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, adres);
    }

}
