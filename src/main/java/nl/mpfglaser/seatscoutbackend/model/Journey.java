package nl.mpfglaser.seatscoutbackend.model;

public class Journey {
    private int id;

    private Timetable timetable;

    private String shortDescription;
    private String longDescription;

    public Journey(Timetable timetable, String shortDescription, String longDescription) {
        this.timetable = timetable;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }

    public int getId() {
        return this.id;
    }

    public Timetable getTimetable() {
        return this.timetable;
    }

    public String getShortDescription() {
        return this.shortDescription;
    }

    public String getLongDescription() {
        return this.longDescription;
    }
}
