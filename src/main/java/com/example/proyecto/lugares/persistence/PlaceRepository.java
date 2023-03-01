package com.example.proyecto.lugares.persistence;

import com.example.proyecto.lugares.model.Place;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaceRepository extends MongoRepository<Place, String> {

    Place getByName(String name);
}
