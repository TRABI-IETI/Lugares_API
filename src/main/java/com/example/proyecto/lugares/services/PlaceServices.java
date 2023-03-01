package com.example.proyecto.lugares.services;

import com.example.proyecto.lugares.model.Place;

import java.util.List;

public interface PlaceServices {

    List<Place> getAllPlaces();

    Place createPlace(Place place);
}
