package put.poznan.kinosequel.model;

import javax.persistence.*;
import java.sql.Time;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "SEANS", schema = "INF136573")
public class Movie {

    private long movieId;
    private Time beginningTime;
    private Time date;
    private long freeSeatsNumber;
    private String cinemaName;
    private long roomNr;
    private String title;
    private Time productionYear;
    private Collection<Ticket> tickets;

    @Id
    @Column(name = "ID_SEANSU")
    public long getMovieId() {
        return movieId;
    }

    public void setMovieId(long movieId) {
        this.movieId = movieId;
    }

    @Basic
    @Column(name = "GODZINA")
    public Time getBeginningTime() {
        return beginningTime;
    }

    public void setBeginningTime(Time beginningTime) {
        this.beginningTime = beginningTime;
    }

    @Basic
    @Column(name = "DATA")
    public Time getDate() {
        return date;
    }

    public void setDate(Time date) {
        this.date = date;
    }

    @Basic
    @Column(name = "LICZBA_WOLNYCH")
    public long getFreeSeatsNumber() {
        return freeSeatsNumber;
    }

    public void setFreeSeatsNumber(long freeSeatsNumber) {
        this.freeSeatsNumber = freeSeatsNumber;
    }

    @Basic
    @Column(name = "SALA_KINO_NAZWA")
    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    @Basic
    @Column(name = "SALA_NR_SALI")
    public long getRoomNr() {
        return roomNr;
    }

    public void setRoomNr(long roomNr) {
        this.roomNr = roomNr;
    }

    @Basic
    @Column(name = "FILM_TYTUL")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "FILM_ROK_PRODUKCJI")
    public Time getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(Time productionYear) {
        this.productionYear = productionYear;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie)o;
        return movieId == movie.movieId &&
                freeSeatsNumber == movie.freeSeatsNumber &&
                roomNr == movie.roomNr &&
                Objects.equals(beginningTime, movie.beginningTime) &&
                Objects.equals(date, movie.date) &&
                Objects.equals(cinemaName, movie.cinemaName) &&
                Objects.equals(title, movie.title) &&
                Objects.equals(productionYear, movie.productionYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieId, beginningTime, date, freeSeatsNumber, cinemaName, roomNr, title, productionYear);
    }

    @OneToMany(mappedBy = "movie")
    public Collection<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(Collection<Ticket> tickets) {
        this.tickets = tickets;
    }

}
