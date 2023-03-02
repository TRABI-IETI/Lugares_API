package com.example.proyecto.lugares.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class PlaceNotFoundException extends ResponseStatusException {
    public PlaceNotFoundException(String name) {
        super(HttpStatus.NOT_FOUND, "Place with name: " + name + " not found");
    }
}
