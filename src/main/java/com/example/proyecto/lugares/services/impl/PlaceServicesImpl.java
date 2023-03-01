package com.example.proyecto.lugares.services.impl;

import com.example.proyecto.lugares.exception.PlaceNotFoundException;
import com.example.proyecto.lugares.model.Place;
import com.example.proyecto.lugares.persistence.PlaceRepository;
import com.example.proyecto.lugares.services.PlaceServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PlaceServicesImpl implements PlaceServices {

    @Autowired
    PlaceRepository placeRepository;

    Map<String, Place> places = new HashMap<>();

    @Override
    public List<Place> getAllPlaces() {
        return placeRepository.findAll();
    }

    @Override
    public Optional<Place> createPlace(Place place) {
        placeRepository.save(place);
        return placeRepository.findById(place.getName());
    }

    @Override
    public Place updatePlace(String name, Place place) throws PlaceNotFoundException{
        if(!places.containsKey(name)){
            throw new PlaceNotFoundException(place.getName());
        }else {
            places.replace(name,place);
        }
        return places.get(name);
    }

    @Override
    public void deletePlace(String name) throws PlaceNotFoundException{
        if(!places.containsKey(name)){
            throw new PlaceNotFoundException(name);
        }else{
            places.remove(name);
        }
    }
}
