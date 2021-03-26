package nl.mpfglaser.seatscoutbackend.controllers;

import nl.mpfglaser.seatscoutbackend.model.Vehicle;
import nl.mpfglaser.seatscoutbackend.repository.FakeDataStore;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class VehicleController {
    FakeDataStore fakeDataStore = new FakeDataStore();

    @CrossOrigin()
    @GetMapping("/vehicles")
    public List<Vehicle> all() {
        return fakeDataStore.getAllVehicles();
    }

    @CrossOrigin()
    @GetMapping("/vehicles/{name}")
    public Vehicle vehicle(@PathVariable String name) {
        return fakeDataStore.getVehicle(name);
    }

    @CrossOrigin()
    @PostMapping(path = "/vehicles", consumes = "application/json", produces = "application/json")
    public Vehicle newVehicle(@RequestBody Vehicle newVehicle) {
        return fakeDataStore.addVehicle(newVehicle);
    }

    @CrossOrigin()
    @PutMapping(path = "/vehicles", consumes = "application/json", produces = "application/json")
    public Vehicle updateVehicle(@RequestBody Vehicle updateVehicle) {
        return fakeDataStore.updateVehicle(updateVehicle);
    }
}
