package nl.mpfglaser.seatscoutbackend.service;

import nl.mpfglaser.seatscoutbackend.model.Vehicle;
import nl.mpfglaser.seatscoutbackend.repository.VehicleRepository;

import java.util.List;

public class VehicleService {
    VehicleRepository vehicleRepository = new VehicleRepository();

    public List<Vehicle> getAll() {
        return vehicleRepository.getAll();
    }

    public Vehicle getById(int id) {
        return vehicleRepository.getById(id);
    }

    public Vehicle getByTypeName(String type_name){
        return vehicleRepository.getByTypeName(type_name);
    }

    public Vehicle create(Vehicle newVehicle) {
        return vehicleRepository.create(newVehicle);
    }

    public Vehicle update(Vehicle updateVehicle) {
        return vehicleRepository.update(updateVehicle);
    }
}
