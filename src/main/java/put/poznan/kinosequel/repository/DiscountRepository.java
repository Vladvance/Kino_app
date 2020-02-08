package put.poznan.kinosequel.repository;

import org.springframework.data.repository.CrudRepository;
import put.poznan.kinosequel.model.Discount;
import put.poznan.kinosequel.model.Film;
import put.poznan.kinosequel.model.FilmPK;

import java.util.List;

public interface DiscountRepository extends CrudRepository<Discount, Long> {
}
