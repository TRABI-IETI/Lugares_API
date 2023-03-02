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
    public Optional<Place> getPlaceByName(String name){

        return Optional.ofNullable(placeRepository.findById(name).orElseThrow(() -> new PlaceNotFoundException(name)));
    }
    @Override
    public Optional<Place> createPlace(Place place) {
        placeRepository.save(place);
        return placeRepository.findById(place.getName());
    }

    @Override
    public Optional<Place> updatePlace(String name, Place place) throws PlaceNotFoundException{
        if(!placeRepository.existsById(name)){
            throw new PlaceNotFoundException(place.getName());
        }else {
            Optional<Place> place1 = placeRepository.findById(name);
            place1.get().update(place);
            placeRepository.save(place1.get());
        }
        return placeRepository.findById(name);
    }

    @Override
    public void deletePlace(String name) throws PlaceNotFoundException{
        if(!placeRepository.existsById(name)){
            throw new PlaceNotFoundException(name);
        }else{
            Optional<Place> place = placeRepository.findById(name);
            placeRepository.delete(place.get());
        }
    }
}
