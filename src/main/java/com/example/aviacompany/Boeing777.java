package com.example.aviacompany;

public class Boeing777 extends CivilJet implements CivilAircraft{

  public Boeing777(double cost, double monthlyMaintenance, double ticketCost, double ticketCostP, int sits, int sitsP, int flights) {
        super("Boeing-777", cost, monthlyMaintenance, ticketCost, ticketCostP, sits, sitsP, flights);
    }

    public String getInfo(){
        return "Type: "+this.getUseArea()+", Model: "+this.getModel()+", Cost: "+this.getCost()+", Monthly maintenance: -$"+this.getMonthlyMaintenance()+", General sits: "+this.getSits()+", Business sits: "+this.getSitsP()+", General ticket price: "+this.getTicketCost()+", Business ticket price: "+this.getTicketCostP()+" flights per month: "+this.getFlights();
    }

    @Override
    public Double calculation() {
       return this.getSits()*this.getTicketCost()+this.getSitsP()*this.getTicketCostP();
    }
}
