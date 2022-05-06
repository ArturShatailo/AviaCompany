package com.example.aviacompany;

import java.util.ArrayList;

public class Company {

    private Double capital;
    private String name;
    private ArrayList <Aircraft> aircrafts = new ArrayList<>();
    private ArrayList <Pilot> pilots = new ArrayList<>();

    public Company(Double capital, String name) {
        this.capital = capital;
        this.name = name;
    }

    public Double getCapital() {
        return capital;
    }

    public String getName() {
        return name;
    }

    public void setCapital(Double capital) {
        this.capital = capital;
    }

    public ArrayList<Aircraft> getAircrafts() {
        return aircrafts;
    }

    public ArrayList<Pilot> getPilots() {
        return pilots;
    }
}
