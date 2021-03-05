package nl.mpfglaser.seatscoutbackend;

import nl.mpfglaser.seatscoutbackend.controllers.VehicleController;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SeatscoutBackendApplicationTests {

	@Autowired
	private VehicleController vehicleController;

	@Test
	void contextLoads() {
		assertThat(vehicleController).isNotNull();
	}
}
