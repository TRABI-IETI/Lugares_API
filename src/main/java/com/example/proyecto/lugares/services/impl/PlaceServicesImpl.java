package com.example.proyecto.lugares.services.impl;

import com.example.proyecto.lugares.model.Place;
import com.example.proyecto.lugares.services.PlaceServices;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PlaceServicesImpl implements PlaceServices {

    Map<String, Place> places = new HashMap<>();

    @Override
    public List<Place> getAllPlaces() {
        return new ArrayList<>(places.values());
    }

    @Override
    public Place createPlace(Place place) {
        places.put(place.getName(), place);
        return places.get(place.getName());
    }
}
