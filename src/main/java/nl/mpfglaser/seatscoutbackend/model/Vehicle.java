package nl.mpfglaser.seatscoutbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehicles")
public class Vehicle {
    @Id
    @Column(name = "id")
    private final int id;

    @Column(name = "type_name")
    private String type_name;

    @Column(name = "capacity")
    private int capacity;

    public Vehicle(int id, String typeName, int capacity) {
        this.id = id;
        this.type_name = typeName;
        this.capacity = capacity;
    }

    public int getId() {
        return this.id;
    }

    public String getType_name() {
        return this.type_name;
    }

    public void setType_name(String name) {
        if (!name.isBlank()) {
            this.type_name = name;
        }
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
