package FHCampus.CarRental.repositories;

import FHCampus.CarRental.entities.BookACar;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookACarRepository extends MongoRepository<BookACar, String> {
    List<BookACar> findAllByUserId(String userId);
}
