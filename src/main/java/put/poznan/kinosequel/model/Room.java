package put.poznan.kinosequel.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SALA", schema = "INF136573")
public class Room {

    private long roomNr;
    private byte seatNumber;
    private Cinema cinema;

    @Id
    @Column(name = "NR_SALI")
    public long getRoomNr() {
        return roomNr;
    }

    public void setRoomNr(long roomNr) {
        this.roomNr = roomNr;
    }

    @Basic
    @Column(name = "LICZBA_MIEJSC")
    public byte getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(byte seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Room room = (Room)o;
        return roomNr == room.roomNr &&
                seatNumber == room.seatNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomNr, seatNumber);
    }

    @ManyToOne
    @JoinColumn(name = "KINO_NAZWA", referencedColumnName = "NAZWA", nullable = false)
    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

}
