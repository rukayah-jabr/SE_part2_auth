package FHCampus.CarRental.repositories;

import FHCampus.CarRental.entities.Users;
import FHCampus.CarRental.enums.UserRole;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<Users, String> {
    Optional<Users> findFirstByEmail(String email);

    Users findByUserRole(UserRole userRole);
}
