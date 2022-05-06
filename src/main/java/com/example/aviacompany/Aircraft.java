package com.example.aviacompany;

public class Aircraft {

    private String useArea;
    private String model;
    private double cost;
    private int sits;
    private int sitsP;
    private double monthlyMaintenance;
    private double ticketCost;
    private double ticketCostP;

    public Aircraft(String useArea, String model, double cost, double monthlyMaintenance, double ticketCost, double ticketCostP, int sits, int sitsP) {
        this.useArea = useArea;
        this.model = model;
        this.cost = cost;
        this.monthlyMaintenance = monthlyMaintenance;
        this.ticketCost = ticketCost;
        this.ticketCostP = ticketCostP;
        this.sits = sits;
        this.sitsP = sitsP;
    }

    public Aircraft(String useArea, String model, double cost, double ticketCost, double monthlyMaintenance, int sits) {
        this.useArea = useArea;
        this.model = model;
        this.cost = cost;
        this.ticketCost = ticketCost;
        this.monthlyMaintenance = monthlyMaintenance;
        this.sits = sits;
    }

    public Aircraft(String useArea, String model, double cost, double monthlyMaintenance) {
        this.useArea = useArea;
        this.model = model;
        this.cost = cost;
        this.monthlyMaintenance = monthlyMaintenance;
    }

    public Double getCost() {
        return cost;
    }

    public Double getTicketCostP() {
        return ticketCostP;
    }

    public Double getTicketCost(){ return ticketCost; }

    public Double getMonthlyMaintenance(){ return monthlyMaintenance; }

    public String getModel() {
        return model;
    }

    public int getSits() {
        return sits;
    }

    public int getSitsP() {
        return sitsP;
    }

    public String getUseArea() {
        return useArea;
    }

    public void getInfo(){
        System.out.println("Aircraft");
    }

    @Override
    public String toString(){
        return this.model;
    }



}
