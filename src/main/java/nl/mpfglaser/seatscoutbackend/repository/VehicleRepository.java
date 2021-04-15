package nl.mpfglaser.seatscoutbackend.repository;

import io.ebean.DB;
import nl.mpfglaser.seatscoutbackend.model.Vehicle;

import java.util.List;

public class VehicleRepository {
    public List<Vehicle> getAll() {
        return DB.find(Vehicle.class).findList();
    }

    public Vehicle getById(int id) {
        return DB.find(Vehicle.class).where().eq("id", id).findOne();
    }

    public Vehicle getByTypeName(String type_name) {
        return DB.find(Vehicle.class).where().eq("type_name", type_name).findOne();
    }

    public Vehicle create(Vehicle newVehicle) {
        DB.save(newVehicle);
        return DB.find(Vehicle.class).where().eq("id", newVehicle.getId()).findOne();
    }

    public Vehicle update(Vehicle updateVehicle) {
        DB.update(updateVehicle);
        return DB.find(Vehicle.class).where().eq("id", updateVehicle.getId()).findOne();
    }
}
