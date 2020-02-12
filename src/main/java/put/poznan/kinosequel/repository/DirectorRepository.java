package put.poznan.kinosequel.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import put.poznan.kinosequel.model.Director;
import put.poznan.kinosequel.model.DirectorPK;


@Repository
public interface DirectorRepository extends CrudRepository<Director, DirectorPK> {
}
