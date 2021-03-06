package com.example.aviacompany;

public class RaptorF22 extends MilitaryJet implements MilitaryAircraft{

    public RaptorF22(double cost, double monthlyMaintenance, int defenceChance) {
        super("F-22", cost, monthlyMaintenance, defenceChance);
    }

    //implemented from MilitaryAircraft
    public String getInfo(){
        return "Type: "+this.getUseArea()+", Model: "+this.getModel()+", Cost: "+this.getCost()+", Monthly maintenance: -$"+this.getMonthlyMaintenance()+", +"+this.getDefenceChance()+"% to defence chance";
    }

}
