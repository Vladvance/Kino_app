package put.poznan.kinosequel.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "ZAMOWIENIE", schema = "INF136573")
public class Order {

    private long orderId;
    private long clientId;

    private Collection<Ticket> tickets;

    @Id
    @Column(name = "NR_ZAMOWIENIA")
    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "KLIENT_ID_KLIENTA")
    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Order order = (Order)o;
        return orderId == order.orderId &&
                clientId == order.clientId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, clientId);
    }

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    public Collection<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(Collection<Ticket> tickets) {
        this.tickets = tickets;
    }

}
