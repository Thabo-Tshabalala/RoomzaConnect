package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.model.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
}
