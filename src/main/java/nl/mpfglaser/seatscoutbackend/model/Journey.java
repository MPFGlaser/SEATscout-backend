package nl.mpfglaser.seatscoutbackend.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "journeys")
public class Journey {
    @Id
    @Column(name = "id")
    private int id;

    @OneToMany(mappedBy = "journey", fetch = FetchType.EAGER)
    private List<Stop> stops;

    @Column(name = "description_short")
    private String shortDescription;

    @Column(name = "description_long")
    private String longDescription;

    public Journey(int id, List<Stop> stops, String shortDescription, String longDescription) {
        this.id = id;
        this.stops = stops;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }

    public int getId() {
        return this.id;
    }

    public String getShortDescription() {
        return this.shortDescription;
    }

    public String getLongDescription() {
        return this.longDescription;
    }

    public void setStops(List<Stop> stops){
        this.stops = stops;
    }

    public List<Stop> getStops(){
        return this.stops;
    }
}
