package put.poznan.kinosequel.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SALA", schema = "INF136573")
public class Room {

    private byte roomNo;
    private int seatNumber;
    private Cinema cinema;

    @Id
    @Column(name = "NR_SALI")
    public byte getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(byte roomNr) {
        this.roomNo = roomNr;
    }

    @Basic
    @Column(name = "LICZBA_MIEJSC")
    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Room room = (Room)o;
        return roomNo == room.roomNo &&
                seatNumber == room.seatNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomNo, seatNumber);
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
