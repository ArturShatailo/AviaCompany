package com.example.aviacompany;

public class Boeing777 extends Aircraft implements CivilAircraft{

    private double ticketCost;
    private double ticketCostP;
    private int sits;
    private int sitsP;

    public Boeing777(double cost, double monthlyMaintenance, double ticketCost, double ticketCostP, int sits, int sitsP) {
        super("Airliner", "Boeing-777", cost, monthlyMaintenance);
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

    public String getInfo(){
        return "Type: "+this.getUseArea()+", Model: "+this.getModel()+", Cost: "+this.getCost()+", Monthly maintenance: -$"+this.getMonthlyMaintenance()+", General sits: "+this.getSits()+", Business sits: "+this.getSitsP()+", General ticket price: "+this.getTicketCost()+", Business ticket price: "+this.getTicketCostP();
    }

}
