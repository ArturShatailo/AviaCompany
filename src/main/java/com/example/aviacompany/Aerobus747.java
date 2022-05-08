package com.example.aviacompany;

public class Aerobus747 extends CivilJet implements CivilAircraft{

    public Aerobus747(double cost, double monthlyMaintenance, double ticketCost, int sits) {
        super("Aerobus-747", cost, monthlyMaintenance, ticketCost, sits);
    }

    public String getInfo(){
        return "Type: "+this.getUseArea()+", Model: "+this.getModel()+", Cost: "+this.getCost()+", Monthly maintenance: -$"+this.getMonthlyMaintenance()+", General sits: "+this.getSits()+", General ticket price: "+this.getTicketCost();
    }

    @Override
    public Double calculation() {
        return this.getSits()*this.getTicketCost();
    }

}
