package com.example.proyecto.lugares.controller;

import com.example.proyecto.lugares.services.PlaceServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/places")
public class PlaceController {

    PlaceServices placeServices;

    public PlaceController(@Autowired PlaceServices placeServices){
        this.placeServices = placeServices;
    }

    @GetMapping
    public ResponseEntity<?> getAllPlaces(){
        return ResponseEntity.ok(placeServices.getAllPlaces());
    }
}
