package put.poznan.kinosequel.repository;

import org.springframework.data.repository.CrudRepository;
import put.poznan.kinosequel.model.Film;
import put.poznan.kinosequel.model.FilmPK;
import put.poznan.kinosequel.model.Movie;

import java.util.List;

public interface MovieRepository extends CrudRepository<Movie, Long> {
}
