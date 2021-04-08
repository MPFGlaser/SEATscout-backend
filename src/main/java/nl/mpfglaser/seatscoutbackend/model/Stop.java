package nl.mpfglaser.seatscoutbackend.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "stops")
public class Stop {
    @Id
    @Column(name = "id")
    private int id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "location_id")
    private Location location;

    @OneToOne(optional = false)
    @JoinColumn(name = "journey_id")
    private Journey journey;

    @Column(name = "arrival")
    private LocalDateTime arrival;

    @Column(name = "departure")
    private LocalDateTime departure;

    public Stop(int id, Location location, Journey journey, LocalDateTime arrival, LocalDateTime departure) {
        this.id = id;
        this.location = location;
        this.journey = journey;
        this.arrival = arrival;
        this.departure = departure;
    }

    public int getId(){ return this.id; }

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
