package com.example.aviacompany;

public class CivilJet extends Aircraft{

    private double ticketCost;
    private int sits;
    private double ticketCostP;
    private int sitsP;


    public CivilJet(String model, double cost, double monthlyMaintenance, double ticketCost, int sits) {
        super("Airliner", model, cost, monthlyMaintenance);
        this.ticketCost = ticketCost;
        this.sits = sits;
    }

    public CivilJet(String model, double cost, double monthlyMaintenance, double ticketCost, double ticketCostP, int sits, int sitsP) {
        super("Airliner", model, cost, monthlyMaintenance);
        this.ticketCost = ticketCost;
        this.ticketCostP = ticketCostP;
        this.sits = sits;
        this.sitsP = sitsP;
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

}
