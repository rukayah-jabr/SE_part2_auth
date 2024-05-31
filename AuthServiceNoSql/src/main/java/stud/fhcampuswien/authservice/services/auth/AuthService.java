package stud.fhcampuswien.authservice.services.auth;

import stud.fhcampuswien.authservice.dtos.SignupRequest;
import stud.fhcampuswien.authservice.dtos.UserDto;

public interface AuthService {

    UserDto createCustomer(SignupRequest signupRequest);

    boolean hasCustomerWithEmail(String email);

}
