package stud.fhcampuswien.authservice.repositories;

import stud.fhcampuswien.authservice.entities.Users;
import stud.fhcampuswien.authservice.enums.UserRole;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<Users, String> {
    Optional<Users> findFirstByEmail(String email);

    Users findByUserRole(UserRole userRole);
}
