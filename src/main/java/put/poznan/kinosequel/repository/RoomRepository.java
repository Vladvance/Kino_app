package put.poznan.kinosequel.repository;

import org.springframework.data.repository.CrudRepository;
import put.poznan.kinosequel.model.Film;
import put.poznan.kinosequel.model.FilmPK;
import put.poznan.kinosequel.model.Room;

import java.util.List;

public interface RoomRepository extends CrudRepository<Room, Long> {
    //TODO: Sała może identyfikować się nie tylko numerem, ale i kinem.
}
