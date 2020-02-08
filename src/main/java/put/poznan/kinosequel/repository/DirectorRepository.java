package put.poznan.kinosequel.repository;

import org.springframework.data.repository.CrudRepository;
import put.poznan.kinosequel.model.Director;
import put.poznan.kinosequel.model.DirectorPK;


public interface DirectorRepository extends CrudRepository<Director, DirectorPK> {
}
