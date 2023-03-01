package com.example.proyecto.lugares.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "places_collection")
public class Place implements Serializable {

    @Id
    private String name;
    private String price;
    private String address;
    private String phone;
    private String schedule;
    private String restrictions;

    public Place() {
    }

    public Place(String name, String price, String address, String phone, String schedule, String restrictions) {
        this.name = name;
        this.price = price;
        this.address = address;
        this.phone = phone;
        this.schedule = schedule;
        this.restrictions = restrictions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(String restrictions) {
        this.restrictions = restrictions;
    }
}
