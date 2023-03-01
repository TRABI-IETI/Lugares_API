package com.example.proyecto.lugares.services;

import com.example.proyecto.lugares.model.Place;

import java.util.List;
import java.util.Optional;

public interface PlaceServices {

    List<Place> getAllPlaces();

    Place getPlaceByName(String name);

    Optional<Place> createPlace(Place place);

    Optional<Place> updatePlace(String name, Place place);

    void deletePlace(String name);
}
