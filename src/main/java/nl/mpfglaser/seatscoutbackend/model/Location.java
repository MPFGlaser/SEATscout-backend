package nl.mpfglaser.seatscoutbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "locations")
public class Location {
    @Id
    @Column(name = "id")
    private final int id;

    @Column(name = "name")
    private final String name;

    @Column(name = "description")
    private final String description;

    public Location(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }
}
