package nl.mpfglaser.seatscoutbackend.repository;

import io.ebean.DB;
import nl.mpfglaser.seatscoutbackend.model.Vehicle;
import nl.mpfglaser.seatscoutbackend.model.dto.VehicleDTO;

import java.util.List;

public class VehicleRepository {
    public List<Vehicle> getAll() {
        return DB.find(Vehicle.class).findList();
    }

    public Vehicle getById(int id) {
        return DB.find(Vehicle.class).where().eq("id", id).findOne();
    }

    public Vehicle getByTypeName(String typeName) {
        return DB.find(Vehicle.class).where().eq("type_name", typeName).findOne();
    }

    public Vehicle create(VehicleDTO newVehicleDTO) {
        // Should find a better & more graceful way to convert Entity <> DTO
        Vehicle newVehicle = new Vehicle(newVehicleDTO.id, newVehicleDTO.typeName, newVehicleDTO.capacity);
        DB.save(newVehicle);
        return DB.find(Vehicle.class).where().eq("id", newVehicle.getId()).findOne();
    }

    public Vehicle update(VehicleDTO updateVehicleDTO) {
        // Should find a better & more graceful way to convert Entity <> DTO
        Vehicle updateVehicle = new Vehicle(updateVehicleDTO.id, updateVehicleDTO.typeName, updateVehicleDTO.capacity);
        DB.update(updateVehicle);
        return DB.find(Vehicle.class).where().eq("id", updateVehicle.getId()).findOne();
    }
}
