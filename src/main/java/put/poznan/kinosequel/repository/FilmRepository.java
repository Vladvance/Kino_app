package put.poznan.kinosequel.repository;

import org.springframework.data.repository.CrudRepository;
import put.poznan.kinosequel.model.Film;
import put.poznan.kinosequel.model.FilmPK;

import java.util.List;

public interface FilmRepository extends CrudRepository<Film, FilmPK> {

    List<Film> findByTitle(String title);

    List<Film> findByProductionYear(String productionYear);

}
