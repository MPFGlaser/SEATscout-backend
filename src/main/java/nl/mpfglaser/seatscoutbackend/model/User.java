package nl.mpfglaser.seatscoutbackend.model;

import java.time.LocalDateTime;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDateTime dateOfBirth;

    public User(String firstName, String lastName, String email, LocalDateTime dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public LocalDateTime getDateOfBirth() {
        return this.dateOfBirth;
    }
}
