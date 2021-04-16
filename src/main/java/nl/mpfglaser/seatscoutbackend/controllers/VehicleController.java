package nl.mpfglaser.seatscoutbackend.controllers;

import nl.mpfglaser.seatscoutbackend.model.Vehicle;
import nl.mpfglaser.seatscoutbackend.service.VehicleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin()
@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {
    VehicleService vehicleService = new VehicleService();

    @GetMapping("/all")
    public ResponseEntity<List<Vehicle>> all() {
        return vehicleService.getAll();
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Vehicle> vehicle(@PathVariable int id) {
        return vehicleService.getById(id);
    }

    @GetMapping("/type_name/{type_name}")
    public ResponseEntity<Vehicle> vehicle(@PathVariable String typeName) {
        return vehicleService.getByTypeName(typeName);
    }

    @PostMapping(path = "/new", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Vehicle> newVehicle(@RequestBody Vehicle newVehicle) {
        return vehicleService.create(newVehicle);
    }

    @PutMapping(path = "/update", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Vehicle> updateVehicle(@RequestBody Vehicle updateVehicle) {
        return vehicleService.update(updateVehicle);
    }
}
