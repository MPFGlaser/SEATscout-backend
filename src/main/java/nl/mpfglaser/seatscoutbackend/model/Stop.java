package nl.mpfglaser.seatscoutbackend.model;

import java.time.LocalDateTime;

public class Stop {
    private Location location;
    private LocalDateTime arrival;
    private LocalDateTime departure;

    public Stop(Location location, LocalDateTime arrival, LocalDateTime departure) {
        this.location = location;
        this.arrival = arrival;
        this.departure = departure;
    }

    public Location getLocation() {
        return this.location;
    }

    public LocalDateTime getArrival() {
        return this.arrival;
    }

    public LocalDateTime getDeparture() {
        return this.departure;
    }
}
