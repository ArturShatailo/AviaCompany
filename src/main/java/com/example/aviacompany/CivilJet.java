package com.example.aviacompany;

public class CivilJet extends Aircraft{

    public CivilJet(String model, double cost, double monthlyMaintenance, double ticketCost, double ticketCostP, int sits, int sitsP) {
        super("Airliner", model, cost, monthlyMaintenance, ticketCost, ticketCostP, sits, sitsP);
    }

    public CivilJet(String model, double cost, double monthlyMaintenance, double ticketCost, int sits) {
        super("Airliner", model, cost, monthlyMaintenance, ticketCost, sits);
    }

    @Override
    public void getInfo(){
        System.out.println("Type: "+this.getUseArea()+", Model: "+this.getModel()+", Cost: "+this.getCost()+", Monthly maintenance: -$"+this.getMonthlyMaintenance()+", General sits: "+this.getSits()+", Business sits: "+this.getSitsP()+", General ticket price: "+this.getTicketCost()+", Business ticket price: "+this.getTicketCostP());
    }

}
