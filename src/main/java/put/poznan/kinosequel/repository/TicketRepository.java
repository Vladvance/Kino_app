package put.poznan.kinosequel.repository;

import org.springframework.data.repository.CrudRepository;
import put.poznan.kinosequel.model.Film;
import put.poznan.kinosequel.model.FilmPK;
import put.poznan.kinosequel.model.Ticket;

import java.util.List;

public interface TicketRepository extends CrudRepository<Ticket, Long> {
    List <Ticket> findAllByOrderOrderId(Long orderId);
}
