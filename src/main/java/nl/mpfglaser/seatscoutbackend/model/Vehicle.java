package nl.mpfglaser.seatscoutbackend.model;

public class Vehicle {
    private String typeName;
    private int capacity;

    public Vehicle(String typeName, int capacity) {
        this.typeName = typeName;
        this.capacity = capacity;
    }

    public String getTypeName() {
        return this.typeName;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setTypeName(String name){
        if(!name.isBlank()){
            this.typeName = name;
        }
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
}