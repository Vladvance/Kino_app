package put.poznan.kinosequel.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import put.poznan.kinosequel.model.Film;
import put.poznan.kinosequel.model.FilmPK;

import java.util.List;

@Repository
public interface FilmRepository extends CrudRepository<Film, FilmPK> {

    List<Film> findByTitle(String title);

    List<Film> findByProductionYear(String productionYear);

}
