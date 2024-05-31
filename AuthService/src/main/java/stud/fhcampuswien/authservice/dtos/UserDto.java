package stud.fhcampuswien.authservice.dtos;

import stud.fhcampuswien.authservice.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {

    private Long id;

    private String name;

    private String email;

    private String password;

    private UserRole userRole;

}
