package nl.mpfglaser.seatscoutbackend.controllers;

import nl.mpfglaser.seatscoutbackend.model.Journey;
import nl.mpfglaser.seatscoutbackend.service.JourneyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin()
@RestController
public class JourneyController {
    JourneyService journeyService = new JourneyService();

    @GetMapping("/journeys")
    public List<Journey> all(){
        return journeyService.all();
    }

    @GetMapping("/journeys/{id}")
    public Journey journey(@PathVariable int id){
        return journeyService.journey(id);
    }
}
