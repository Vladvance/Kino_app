package put.poznan.kinosequel.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "BILET", schema = "INF136573")
public class Ticket {

    private long ticketId;
    private String type;
    private byte seatNr;
    private Order order;
    private Discount discount;
    private Movie movie;

    @Id
    @Column(name = "ID_BILETU")
    public long getTicketId() {
        return ticketId;
    }

    public void setTicketId(long ticketId) {
        this.ticketId = ticketId;
    }

    @Basic
    @Column(name = "RODZAJ")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "NR_MIEJSCA")
    public byte getSeatNr() {
        return seatNr;
    }

    public void setSeatNr(byte seatNr) {
        this.seatNr = seatNr;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket)o;
        return ticketId == ticket.ticketId &&
                seatNr == ticket.seatNr &&
                Objects.equals(type, ticket.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticketId, type, seatNr);
    }

    @ManyToOne
    @JoinColumn(name = "ZAMOWIENIE_NR_ZAMOWIENIA", referencedColumnName = "NR_ZAMOWIENIA", nullable = false)
    public Order getOrder() {
        return order;
    }

    public void setOrder(Order orders) {
        this.order = orders;
    }

    @ManyToOne
    @JoinColumn(name = "PROMOCJA_ID_PROM", referencedColumnName = "ID_PROM")
    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discounts) {
        this.discount = discounts;
    }

    @ManyToOne
    @JoinColumn(name = "SEANS_ID_SEANSU", referencedColumnName = "ID_SEANSU", nullable = false)
    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie tickets) {
        this.movie = tickets;
    }

}
