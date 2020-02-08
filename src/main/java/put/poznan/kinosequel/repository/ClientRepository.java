package put.poznan.kinosequel.repository;

import org.springframework.data.repository.CrudRepository;
import put.poznan.kinosequel.model.Client;
import put.poznan.kinosequel.model.Film;
import put.poznan.kinosequel.model.FilmPK;

import java.util.List;

public interface ClientRepository extends CrudRepository<Client, Long> {
}
