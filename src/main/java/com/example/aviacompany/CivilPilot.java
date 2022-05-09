package com.example.aviacompany;

public class CivilPilot extends Pilot implements CalculationOfObject, getObjectInformation {

    private int flights;
    private int defaultFlights;

    public CivilPilot(double salary, int flights) {
        super(salary, "Civil pilot");
        this.flights = flights;
        this.defaultFlights = flights;
    }

    public int getDefaultFlights() {
        return defaultFlights;
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

    @Override
    public String toString(){
        return this.getType()+"("+this.flights+" of "+this.defaultFlights+")";
    }

}
