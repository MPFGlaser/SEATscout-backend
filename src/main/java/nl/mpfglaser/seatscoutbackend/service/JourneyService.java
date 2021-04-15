package nl.mpfglaser.seatscoutbackend.service;

import nl.mpfglaser.seatscoutbackend.model.Journey;
import nl.mpfglaser.seatscoutbackend.repository.JourneyRepository;

import java.util.List;

public class JourneyService {
    JourneyRepository journeyRepository = new JourneyRepository();

    public List<Journey> all(){
        return journeyRepository.all();
    }

    public Journey journey(int id){
        return journeyRepository.journey(id);
    }
}
