package nl.mpfglaser.seatscoutbackend.controllers;

import nl.mpfglaser.seatscoutbackend.model.Vehicle;
import nl.mpfglaser.seatscoutbackend.service.VehicleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin()
@RestController
public class VehicleController {
    VehicleService vehicleService = new VehicleService();

    @GetMapping("/vehicles")
    public List<Vehicle> all() {
        return vehicleService.all();
    }

    @GetMapping("/vehicles/{name}")
    public Vehicle vehicle(@PathVariable String name) {
        return vehicleService.vehicle(name);
    }

    @PostMapping(path = "/vehicles", consumes = "application/json", produces = "application/json")
    public Vehicle newVehicle(@RequestBody Vehicle newVehicle) {
        return vehicleService.newVehicle(newVehicle);
    }

    @PutMapping(path = "/vehicles", consumes = "application/json", produces = "application/json")
    public Vehicle updateVehicle(@RequestBody Vehicle updateVehicle) {
        return vehicleService.updateVehicle(updateVehicle);
    }
}
