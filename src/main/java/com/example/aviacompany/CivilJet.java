package com.example.aviacompany;

public class CivilJet extends Aircraft{

    private double ticketCost;
    private int sits;
    private double ticketCostP;
    private int sitsP;
    private int flights;
    private int defaultFlights;


    public CivilJet(String model, double cost, double monthlyMaintenance, double ticketCost, int sits, int flights) {
        super("Airliner", model, cost, monthlyMaintenance);
        this.ticketCost = ticketCost;
        this.sits = sits;
        this.flights = flights;
        this.defaultFlights = flights;
    }

    public CivilJet(String model, double cost, double monthlyMaintenance, double ticketCost, double ticketCostP, int sits, int sitsP, int flights) {
        super("Airliner", model, cost, monthlyMaintenance);
        this.ticketCost = ticketCost;
        this.ticketCostP = ticketCostP;
        this.sits = sits;
        this.sitsP = sitsP;
        this.flights = flights;
        this.defaultFlights = flights;
    }

    public int getDefaultFlights() {
        return defaultFlights;
    }

    public Double getTicketCostP() {
        return ticketCostP;
    }

    public Double getTicketCost(){ return ticketCost; }

    public int getSits() {
        return sits;
    }

    public int getSitsP() {
        return sitsP;
    }

    public int getFlights() {
        return flights;
    }

    public void setFlights(int flights) {
        this.flights = flights;
    }

    public Double calculation(){
        return null;
    }

    @Override
    public String toString(){
        return this.getModel()+"("+this.flights+" of "+this.defaultFlights+")";
    }

}
