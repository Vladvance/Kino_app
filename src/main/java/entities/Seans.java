package entities;

import javax.persistence.*;
import java.sql.Time;
import java.util.Collection;

@Entity
public class Seans {

    private long idSeansu;
    private Time godzina;
    private Time data;
    private long liczbaWolnych;
    private String salaKinoNazwa;
    private long salaNrSali;
    private String filmTytul;
    private Time filmRokProdukcji;
    private Collection<Bilet> biletsByIdSeansu;

    @Id
    @Column(name = "ID_SEANSU")
    public long getIdSeansu() {
        return idSeansu;
    }

    public void setIdSeansu(long idSeansu) {
        this.idSeansu = idSeansu;
    }

    @Basic
    @Column(name = "GODZINA")
    public Time getGodzina() {
        return godzina;
    }

    public void setGodzina(Time godzina) {
        this.godzina = godzina;
    }

    @Basic
    @Column(name = "DATA")
    public Time getData() {
        return data;
    }

    public void setData(Time data) {
        this.data = data;
    }

    @Basic
    @Column(name = "LICZBA_WOLNYCH")
    public long getLiczbaWolnych() {
        return liczbaWolnych;
    }

    public void setLiczbaWolnych(long liczbaWolnych) {
        this.liczbaWolnych = liczbaWolnych;
    }

    @Basic
    @Column(name = "SALA_KINO_NAZWA")
    public String getSalaKinoNazwa() {
        return salaKinoNazwa;
    }

    public void setSalaKinoNazwa(String salaKinoNazwa) {
        this.salaKinoNazwa = salaKinoNazwa;
    }

    @Basic
    @Column(name = "SALA_NR_SALI")
    public long getSalaNrSali() {
        return salaNrSali;
    }

    public void setSalaNrSali(long salaNrSali) {
        this.salaNrSali = salaNrSali;
    }

    @Basic
    @Column(name = "FILM_TYTUL")
    public String getFilmTytul() {
        return filmTytul;
    }

    public void setFilmTytul(String filmTytul) {
        this.filmTytul = filmTytul;
    }

    @Basic
    @Column(name = "FILM_ROK_PRODUKCJI")
    public Time getFilmRokProdukcji() {
        return filmRokProdukcji;
    }

    public void setFilmRokProdukcji(Time filmRokProdukcji) {
        this.filmRokProdukcji = filmRokProdukcji;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        Seans seans = (Seans)o;

        if(idSeansu != seans.idSeansu) return false;
        if(liczbaWolnych != seans.liczbaWolnych) return false;
        if(salaNrSali != seans.salaNrSali) return false;
        if(godzina != null ? !godzina.equals(seans.godzina) : seans.godzina != null) return false;
        if(data != null ? !data.equals(seans.data) : seans.data != null) return false;
        if(salaKinoNazwa != null ? !salaKinoNazwa.equals(seans.salaKinoNazwa) : seans.salaKinoNazwa != null)
            return false;
        if(filmTytul != null ? !filmTytul.equals(seans.filmTytul) : seans.filmTytul != null) return false;
        if(filmRokProdukcji != null ? !filmRokProdukcji.equals(seans.filmRokProdukcji) : seans.filmRokProdukcji != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int)(idSeansu ^ (idSeansu >>> 32));
        result = 31 * result + (godzina != null ? godzina.hashCode() : 0);
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + (int)(liczbaWolnych ^ (liczbaWolnych >>> 32));
        result = 31 * result + (salaKinoNazwa != null ? salaKinoNazwa.hashCode() : 0);
        result = 31 * result + (int)(salaNrSali ^ (salaNrSali >>> 32));
        result = 31 * result + (filmTytul != null ? filmTytul.hashCode() : 0);
        result = 31 * result + (filmRokProdukcji != null ? filmRokProdukcji.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "seansBySeansIdSeansu")
    public Collection<Bilet> getBiletsByIdSeansu() {
        return biletsByIdSeansu;
    }

    public void setBiletsByIdSeansu(Collection<Bilet> biletsByIdSeansu) {
        this.biletsByIdSeansu = biletsByIdSeansu;
    }

}
