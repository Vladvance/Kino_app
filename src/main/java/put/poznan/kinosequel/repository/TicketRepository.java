package put.poznan.kinosequel.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import put.poznan.kinosequel.model.Film;
import put.poznan.kinosequel.model.FilmPK;
import put.poznan.kinosequel.model.Ticket;

import java.lang.annotation.Repeatable;
import java.util.List;

@Repository
public interface TicketRepository extends CrudRepository<Ticket, Long> {
    List <Ticket> findAllByOrderOrderId(Long orderId);
}
