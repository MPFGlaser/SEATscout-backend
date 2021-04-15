package nl.mpfglaser.seatscoutbackend.service;

import nl.mpfglaser.seatscoutbackend.model.Journey;
import nl.mpfglaser.seatscoutbackend.repository.JourneyRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class JourneyService {
    JourneyRepository journeyRepository = new JourneyRepository();

    public ResponseEntity<List<Journey>> all() {
        List<Journey> output = journeyRepository.all();
        if (output != null) {
            return new ResponseEntity<>(output, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<Journey> journey(int id) {
        Journey output = journeyRepository.journey(id);
        if (output != null) {
            return new ResponseEntity<>(output, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
