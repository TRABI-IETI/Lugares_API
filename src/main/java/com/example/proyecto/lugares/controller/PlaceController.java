package com.example.proyecto.lugares.controller;

import com.example.proyecto.lugares.model.Place;
import com.example.proyecto.lugares.services.PlaceServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseEntity<?> createPlace(@RequestBody Place place){
        return ResponseEntity.ok(placeServices.createPlace(place));
    }

    @PutMapping("{name}")
    public ResponseEntity<?> updatePlace(@RequestBody Place place, @PathVariable("name") String name){
        System.out.println(name);
        return ResponseEntity.ok(placeServices.updatePlace(name, place));
    }

    @DeleteMapping("{name}")
    public ResponseEntity<?> deletePlace(@PathVariable("name") String name){
        placeServices.deletePlace(name);
        return ResponseEntity.ok().build();
    }
}
