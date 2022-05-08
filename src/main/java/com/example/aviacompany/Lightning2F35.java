package com.example.aviacompany;

public class Lightning2F35 extends MilitaryJet implements MilitaryAircraft{

    public Lightning2F35(double cost, double monthlyMaintenance, int defenceChance) {
        super("F-35", cost, monthlyMaintenance, defenceChance);
    }

    public String getInfo(){
        return "Type: "+this.getUseArea()+", Model: "+this.getModel()+", Cost: "+this.getCost()+", Monthly maintenance: -$"+this.getMonthlyMaintenance()+", +"+this.getDefenceChance()+"% to defence chance";
    }

}
