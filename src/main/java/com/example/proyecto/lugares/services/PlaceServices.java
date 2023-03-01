package com.example.proyecto.lugares.services;

import com.example.proyecto.lugares.model.Place;

import java.util.List;

public interface PlaceServices {

    List<Place> getAllPlaces();

    Place getPlaceByName(String name);
    Place createPlace(Place place);

    Place updatePlace(String name, Place place);

    void deletePlace(String name);
}
