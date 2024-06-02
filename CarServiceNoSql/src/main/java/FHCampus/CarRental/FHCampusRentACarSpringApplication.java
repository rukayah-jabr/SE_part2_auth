package FHCampus.CarRental;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages = "FHCampus.CarRental.repositories")
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })

public class FHCampusRentACarSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(FHCampusRentACarSpringApplication.class, args);
	}


}
