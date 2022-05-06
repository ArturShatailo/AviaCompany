package com.example.aviacompany;

public class CivilPilot extends Pilot {

    private int flights;

    public CivilPilot(double salary, int flights) {
        super(salary, "Civil");
        this.flights = flights;
    }

    public int getFlights() {
        return flights;
    }

    public void setFlights(int flights) {
        this.flights = flights;
    }

}
