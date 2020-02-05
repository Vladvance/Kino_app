package entities;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "SEANS", schema = "INF136573")
public class SeansEntity {

    private long idSeansu;
    private Time godzina;
    private Time data;
    private SalaEntity sala;
    private FilmEntity film;

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

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        SeansEntity that = (SeansEntity)o;

        if(idSeansu != that.idSeansu) return false;
        if(godzina != null ? !godzina.equals(that.godzina) : that.godzina != null) return false;
        if(data != null ? !data.equals(that.data) : that.data != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int)(idSeansu ^ (idSeansu >>> 32));
        result = 31 * result + (godzina != null ? godzina.hashCode() : 0);
        result = 31 * result + (data != null ? data.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "SALA_NR_SALI", referencedColumnName = "NR_SALI", nullable = false), @JoinColumn(name = "SALA_KINO_NAZWA", referencedColumnName = "KINO_NAZWA", nullable = false)})
    public SalaEntity getSala() {
        return sala;
    }

    public void setSala(SalaEntity sala) {
        this.sala = sala;
    }

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "FILM_TYTUL", referencedColumnName = "TYTUL", nullable = false), @JoinColumn(name = "FILM_ROK_PRODUKCJI", referencedColumnName = "ROK_PRODUKCJI", nullable = false)})
    public FilmEntity getFilm() {
        return film;
    }

    public void setFilm(FilmEntity film) {
        this.film = film;
    }

}
