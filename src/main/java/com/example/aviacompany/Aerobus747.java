package com.example.aviacompany;

public class Aerobus747 extends Aircraft implements CivilAircraft{

    private double ticketCost;
    private int sits;


    public Aerobus747(double cost, double monthlyMaintenance, double ticketCost, int sits) {
        super("Airliner", "Aerobus-747", cost, monthlyMaintenance);
        this.ticketCost = ticketCost;
        this.sits = sits;
    }

    public Double getTicketCost(){ return ticketCost; }

    public int getSits() {
        return sits;
    }

    public String getInfo(){
        return "Type: "+this.getUseArea()+", Model: "+this.getModel()+", Cost: "+this.getCost()+", Monthly maintenance: -$"+this.getMonthlyMaintenance()+", General sits: "+this.getSits()+", General ticket price: "+this.getTicketCost();
    }

}
