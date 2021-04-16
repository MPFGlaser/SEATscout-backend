package nl.mpfglaser.seatscoutbackend.controllers;

import nl.mpfglaser.seatscoutbackend.model.Journey;
import nl.mpfglaser.seatscoutbackend.service.JourneyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin()
@RestController
@RequestMapping("/api/journeys")
public class JourneyController {
    JourneyService journeyService = new JourneyService();

    @GetMapping("/all")
    public ResponseEntity<List<Journey>> all() {
        return journeyService.all();
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Journey> journey(@PathVariable int id) {
        return journeyService.journey(id);
    }
}
