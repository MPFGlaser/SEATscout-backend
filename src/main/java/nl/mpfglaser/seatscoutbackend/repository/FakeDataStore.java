package nl.mpfglaser.seatscoutbackend.repository;

import nl.mpfglaser.seatscoutbackend.model.Journey;
import nl.mpfglaser.seatscoutbackend.model.Location;
import nl.mpfglaser.seatscoutbackend.model.Stop;
import nl.mpfglaser.seatscoutbackend.model.Vehicle;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FakeDataStore {
    private final List<Journey> journeyList = new ArrayList<>();
    private final List<Vehicle> vehicleList = new ArrayList<>();

    public FakeDataStore() {
        Location eindhovencs = new Location("Eindhoven Centraal", "Eindhoven Centraal Station");
        Location shertogenbosch = new Location("'s-Hertogenbosch", "Station 's-Hertogenbosch");
        Location utrechtcs = new Location("Utrecht Centraal", "Utrecht Centraal Station");
        Location amsterdamamstel = new Location("Amsterdam Amstel", "Station Amsterdam Amstel");
        Location amsterdamcs = new Location("Amsterdam Centraal", "Amsterdam Centraal Station");

        Stop eindhovencsStop = new Stop(eindhovencs,
                LocalDateTime.of(2021, 3, 4, 18, 2),
                LocalDateTime.of(2021, 3, 4, 18, 6));

        Stop shertogenboschStop = new Stop(shertogenbosch,
                LocalDateTime.of(2021, 3, 4, 18, 25),
                LocalDateTime.of(2021, 3, 4, 18, 28));

        Stop utrechtcsStop = new Stop(utrechtcs,
                LocalDateTime.of(2021, 3, 4, 18, 57),
                LocalDateTime.of(2021, 3, 4, 18, 59));

        Stop amsterdamamstelStop = new Stop(amsterdamamstel,
                LocalDateTime.of(2021, 3, 4, 19, 17),
                LocalDateTime.of(2021, 3, 4, 19, 17));

        Stop amterdamcsStop = new Stop(amsterdamcs,
                LocalDateTime.of(2021, 3, 4, 19, 25),
                LocalDateTime.of(2021, 3, 4, 19, 29));


        Stop[] stops = {eindhovencsStop, shertogenboschStop, utrechtcsStop, amsterdamamstelStop, amterdamcsStop};

        Journey eindhovenamsterdamJourney = new Journey(1, stops,
                "Eindhoven CS - Amsterdam CS", "The InterCity journey between Eindhoven Centraal and Amsterdam Centraal");

        journeyList.add(eindhovenamsterdamJourney);

        Vehicle virmm4 = new Vehicle("VIRMm-IV", 62+328);
        Vehicle virmm6 = new Vehicle("VIRMm-VI", 130+440);

        vehicleList.add(virmm4);
        vehicleList.add(virmm6);
    }

    public List<Journey> getJourneyList() {
        return journeyList;
    }

    public Journey getJourney(int id) {
        for (Journey journey : journeyList) {
            if (journey.getId() == id) {
                return journey;
            }
        }
        return null;
    }

    public Stop[] getJourneyStops(int id){
        for(Journey journey : journeyList){
            if(journey.getId() == id){
                journey.getStops();
            }
        }
        return new Stop[0];
    }

    public Stop getJourneyStop(int id, int index){
        for (Journey journey : journeyList){
            if(journey.getId() == id){
                Stop[] stops = journey.getStops();
                if(stops.length >= index){
                    return stops[index];
                }
            }
        }
        return null;
    }

    public Vehicle getVehicle(String name){
        for (Vehicle vehicle : vehicleList){
            if(vehicle.getTypeName().equals(name)){
                return vehicle;
            }
        }
        return null;
    }

    public boolean addVehicle (Vehicle vehicle){
        if(vehicle == null){
            return false;
        }
        vehicleList.add(vehicle);
        return true;
    }

    public boolean updateVehicle(Vehicle vehicle){
        Vehicle old = this.getVehicle(vehicle.getTypeName());
        if (old == null){
            return false;
        }
        old.setTypeName(vehicle.getTypeName());
        old.setCapacity(vehicle.getCapacity());
        return true;
    }

    public boolean deleteVehicle(String name){
        for(Vehicle vehicle : vehicleList){
            if(vehicle.getTypeName().equals(name)){
                return vehicleList.remove(vehicle);
            }
        }
        return false;
    }
}
