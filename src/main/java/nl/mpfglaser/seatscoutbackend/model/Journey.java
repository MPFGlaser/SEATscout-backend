package nl.mpfglaser.seatscoutbackend.model;

public class Journey {
    private int id;

    private Stop[] stops;

    private String shortDescription;
    private String longDescription;

    public Journey(int id, Stop[] stops, String shortDescription, String longDescription) {
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

    public void setStops(Stop[] stops){
        this.stops = stops;
    }

    public Stop[] getStops(){
        return this.stops;
    }
}
