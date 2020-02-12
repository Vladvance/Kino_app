package put.poznan.kinosequel.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import put.poznan.kinosequel.model.Client;
import put.poznan.kinosequel.model.Film;
import put.poznan.kinosequel.model.FilmPK;

import java.util.List;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {
}
