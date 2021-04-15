package nl.mpfglaser.seatscoutbackend.controllers;

import nl.mpfglaser.seatscoutbackend.model.Journey;
import nl.mpfglaser.seatscoutbackend.service.JourneyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin()
@RestController
public class JourneyController {
    JourneyService journeyService = new JourneyService();

    @GetMapping("/journeys")
    public ResponseEntity<List<Journey>> all() {
        return journeyService.all();
    }

    @GetMapping("/journeys/{id}")
    public ResponseEntity<Journey> journey(@PathVariable int id) {
        return journeyService.journey(id);
    }
}
