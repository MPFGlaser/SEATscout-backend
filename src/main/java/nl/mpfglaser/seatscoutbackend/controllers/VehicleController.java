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
        return vehicleService.getAll();
    }

    @GetMapping("/vehicles/{id}")
    public Vehicle vehicle(@PathVariable int id) {
        return vehicleService.getById(id);
    }

    @GetMapping("/vehicles/type_name/{type_name}")
    public Vehicle vehicle(@PathVariable String type_name) {
        return vehicleService.getByTypeName(type_name);
    }

    @PostMapping(path = "/vehicles", consumes = "application/json", produces = "application/json")
    public Vehicle newVehicle(@RequestBody Vehicle newVehicle) {
        return vehicleService.create(newVehicle);
    }

    @PutMapping(path = "/vehicles", consumes = "application/json", produces = "application/json")
    public Vehicle updateVehicle(@RequestBody Vehicle updateVehicle) {
        return vehicleService.update(updateVehicle);
    }
}
