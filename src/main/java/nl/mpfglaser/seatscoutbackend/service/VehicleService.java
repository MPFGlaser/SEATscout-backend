package nl.mpfglaser.seatscoutbackend.service;

import nl.mpfglaser.seatscoutbackend.model.Vehicle;
import nl.mpfglaser.seatscoutbackend.repository.FakeDataStore;

import java.util.List;

public class VehicleService {
    FakeDataStore fakeDataStore = new FakeDataStore();

    public List<Vehicle> all() {
        return fakeDataStore.getAllVehicles();
    }

    public Vehicle vehicle(String name) {
        return fakeDataStore.getVehicle(name);
    }

    public Vehicle newVehicle(Vehicle newVehicle) {
        return fakeDataStore.addVehicle(newVehicle);
    }

    public Vehicle updateVehicle(Vehicle updateVehicle) {
        return fakeDataStore.updateVehicle(updateVehicle);
    }
}
