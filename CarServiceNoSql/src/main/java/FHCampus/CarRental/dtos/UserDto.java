package FHCampus.CarRental.dtos;

import FHCampus.CarRental.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {

    private String id;      //mongodb

    private String name;

    private String email;

    private String password;

    private UserRole userRole;

}
