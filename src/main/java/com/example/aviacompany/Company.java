package com.example.aviacompany;

import java.util.ArrayList;

public class Company {

    private Double capital;
    private String name;
    private ArrayList <MilitaryJet> militaryAircrafts = new ArrayList<>();
    private ArrayList <MilitaryPilot> militaryPilots = new ArrayList<>();
    private ArrayList <CivilJet> civilAircrafts = new ArrayList<>();
    private ArrayList <CivilPilot> civilPilots = new ArrayList<>();

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

    public ArrayList<MilitaryJet> getMilitaryAircrafts() {
        return militaryAircrafts;
    }

    public ArrayList<MilitaryPilot> getMilitaryPilots() {
        return militaryPilots;
    }

    public ArrayList<CivilJet> getCivilAircrafts() {
        return civilAircrafts;
    }

    public ArrayList<CivilPilot> getCivilPilots() {
        return civilPilots;
    }
}
