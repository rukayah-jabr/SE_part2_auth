package stud.fhcampuswien.authservice.dtos;

import stud.fhcampuswien.authservice.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {

    private String id;  // Changed to String for MongoDB compatibility

    private String name;

    private String email;

    private String password;

    private UserRole userRole;

}
