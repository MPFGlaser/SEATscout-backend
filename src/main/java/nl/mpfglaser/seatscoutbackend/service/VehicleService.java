package nl.mpfglaser.seatscoutbackend.service;

import nl.mpfglaser.seatscoutbackend.model.Vehicle;
import nl.mpfglaser.seatscoutbackend.repository.VehicleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class VehicleService {
    VehicleRepository vehicleRepository = new VehicleRepository();

    public ResponseEntity<List<Vehicle>> getAll() {
        List<Vehicle> output = vehicleRepository.getAll();
        if (output != null) {
            return new ResponseEntity<>(output, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<Vehicle> getById(int id) {
        Vehicle output = vehicleRepository.getById(id);
        if (output != null) {
            return new ResponseEntity<>(output, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<Vehicle> getByTypeName(String type_name) {
        Vehicle output = vehicleRepository.getByTypeName(type_name);
        if (output != null) {
            return new ResponseEntity<>(output, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<Vehicle> create(Vehicle newVehicle) {
        Vehicle output = vehicleRepository.create(newVehicle);
        if (output != null) {
            return new ResponseEntity<>(output, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<Vehicle> update(Vehicle updateVehicle) {
        Vehicle output = vehicleRepository.update(updateVehicle);
        if (output != null) {
            return new ResponseEntity<>(output, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
