package nl.mpfglaser.seatscoutbackend.controllers;

import nl.mpfglaser.seatscoutbackend.model.Journey;
import nl.mpfglaser.seatscoutbackend.repository.FakeDataStore;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JourneyController {
    FakeDataStore fakeDataStore = new FakeDataStore();

    @GetMapping("/journeys")
    public List<Journey> all(){
        return fakeDataStore.getJourneyList();
    }

    @GetMapping("/journeys/{id}")
    public Journey journey(@PathVariable int id){
        return fakeDataStore.getJourney(id);
    }
}
