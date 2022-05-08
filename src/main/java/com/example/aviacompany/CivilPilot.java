package com.example.aviacompany;

public class CivilPilot extends Pilot implements GeneralPilot{

    private int flights;

    public CivilPilot(double salary, int flights) {
        super(salary, "Civil pilot");
        this.flights = flights;
    }

    public int getFlights() {
        return flights;
    }

    public void setFlights(int flights) {
        this.flights = flights;
    }

    public String getInfo(){
        return "Type: "+this.getType()+", salary: "+this.getSalary()+", flights per month: "+this.getFlights();
    }

    public Double calculation() {
        return this.getSalary();
    }

}
