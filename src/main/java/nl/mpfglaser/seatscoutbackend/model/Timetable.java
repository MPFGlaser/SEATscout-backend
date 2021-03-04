package nl.mpfglaser.seatscoutbackend.model;

public class Timetable {
    private Stop[] stops;

    public Timetable(){ }

    public Timetable(Stop[] stops){
        this.stops = stops;
    }

    public void setStops(Stop[] stops){
        this.stops = stops;
    }

    public Stop[] getStops(){
        return this.stops;
    }
}
