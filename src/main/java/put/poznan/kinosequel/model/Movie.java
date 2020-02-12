package put.poznan.kinosequel.model;

import javax.persistence.*;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "SEANS", schema = "INF136573")
public class Movie {

    private long movieId;
    private LocalTime beginningTime;
    private LocalDate date;
    private int freeSeatsNumber;
    private String cinemaName;
    private byte roomNo;
    private String title;
    private LocalDate productionYear;
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
    public LocalTime getBeginningTime() {
        return beginningTime;
    }

    public void setBeginningTime(LocalTime beginningTime) {
        this.beginningTime = beginningTime;
    }

    @Basic
    @Column(name = "DATA")
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Basic
    @Column(name = "LICZBA_WOLNYCH")
    public int getFreeSeatsNumber() {
        return freeSeatsNumber;
    }

    public void setFreeSeatsNumber(int freeSeatsNumber) {
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
    public byte getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(byte roomNr) {
        this.roomNo = roomNr;
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
    public LocalDate getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(LocalDate productionYear) {
        this.productionYear = productionYear;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie)o;
        return movieId == movie.movieId &&
                freeSeatsNumber == movie.freeSeatsNumber &&
                roomNo == movie.roomNo &&
                Objects.equals(beginningTime, movie.beginningTime) &&
                Objects.equals(date, movie.date) &&
                Objects.equals(cinemaName, movie.cinemaName) &&
                Objects.equals(title, movie.title) &&
                Objects.equals(productionYear, movie.productionYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieId, beginningTime, date, freeSeatsNumber, cinemaName, roomNo, title, productionYear);
    }

    @OneToMany(mappedBy = "movie")
    public Collection<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(Collection<Ticket> tickets) {
        this.tickets = tickets;
    }

}
