package put.poznan.kinosequel.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import put.poznan.kinosequel.model.Film;
import put.poznan.kinosequel.model.FilmPK;
import put.poznan.kinosequel.model.Room;

import java.util.List;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
    //TODO: Sała może identyfikować się nie tylko numerem, ale i kinem.
}
