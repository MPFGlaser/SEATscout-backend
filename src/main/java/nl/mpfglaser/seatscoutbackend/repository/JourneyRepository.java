package nl.mpfglaser.seatscoutbackend.repository;

import io.ebean.DB;
import nl.mpfglaser.seatscoutbackend.model.Journey;

import java.util.List;

public class JourneyRepository {
    public List<Journey> all(){
        return DB.find(Journey.class).findList();
    }

    public Journey journey(int id){
        return DB.find(Journey.class).where().eq("id", id).findOne();
    }
}
