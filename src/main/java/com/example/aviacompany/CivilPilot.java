package com.example.aviacompany;

public class CivilPilot extends Pilot implements GeneralPilot{

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

    public String getInfo(){
        return "Type: "+this.getType()+" pilot, salary: "+this.getSalary()+", flights per month: "+this.getFlights();
    }

}
