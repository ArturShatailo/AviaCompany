package com.example.aviacompany;

public class RaptorF22 extends Aircraft implements MilitaryAircraft{

    private int defenceChance;

    public RaptorF22(double cost, double monthlyMaintenance, int defenceChance) {
        super("Military", "F-22", cost, monthlyMaintenance);
        this.defenceChance = defenceChance;
    }

    public int getDefenceChance() {
        return defenceChance;
    }


    public String getInfo(){
        return "Type: "+this.getUseArea()+", Model: "+this.getModel()+", Cost: "+this.getCost()+", Monthly maintenance: -$"+this.getMonthlyMaintenance()+", +"+this.defenceChance+"% to defence chance";
    }

}
