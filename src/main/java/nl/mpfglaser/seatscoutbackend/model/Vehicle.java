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
    private String typeName;

    @Column(name = "capacity")
    private int capacity;

    public Vehicle(int id, String typeName, int capacity) {
        this.id = id;
        this.typeName = typeName;
        this.capacity = capacity;
    }

    public int getId() {
        return this.id;
    }

    public String getTypeName() {
        return this.typeName;
    }

    public void setTypeName(String name) {
        if (!name.isBlank()) {
            this.typeName = name;
        }
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
