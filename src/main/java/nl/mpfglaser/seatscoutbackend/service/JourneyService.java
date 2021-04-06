package nl.mpfglaser.seatscoutbackend.service;

import nl.mpfglaser.seatscoutbackend.model.Journey;
import nl.mpfglaser.seatscoutbackend.repository.FakeDataStore;

import java.util.List;

public class JourneyService {
    FakeDataStore fakeDataStore = new FakeDataStore();

    public List<Journey> all(){
        return fakeDataStore.getJourneyList();
    }

    public Journey journey(int id){
        return fakeDataStore.getJourney(id);
    }
}
