package stud.fhcampuswien.authservice.dtos;


import stud.fhcampuswien.authservice.enums.UserRole;
import lombok.Data;


@Data
public class AuthenticationResponse {

    private String jwt;

    private UserRole userRole;

    private Long userId;

}
