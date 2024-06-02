package FHCampus.CarRental.services.customer;

import FHCampus.CarRental.dtos.BookACarDto;
import FHCampus.CarRental.dtos.CarDto;
import FHCampus.CarRental.dtos.CarDtoList;
import FHCampus.CarRental.dtos.SearchCarDto;

import java.util.List;

public interface CustomerService {

    List<CarDto> getAllCars();

    CarDto getCarById(String carId);

    boolean bookACar(String carId, BookACarDto bookACarDto);

    List<BookACarDto> getBookingsByUserId(String userId);

    CarDtoList searchCar(SearchCarDto searchCarDto);

}
