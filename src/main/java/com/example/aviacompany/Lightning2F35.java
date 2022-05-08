package com.example.aviacompany;

public class Lightning2F35 extends Aircraft implements MilitaryAircraft{
    private int defenceChance;

    public Lightning2F35(double cost, double monthlyMaintenance, int defenceChance) {
        super("Military", "F-35", cost, monthlyMaintenance);
        this.defenceChance = defenceChance;
    }

    public int getDefenceChance() {
        return defenceChance;
    }


    public String getInfo(){
        return "Type: "+this.getUseArea()+", Model: "+this.getModel()+", Cost: "+this.getCost()+", Monthly maintenance: -$"+this.getMonthlyMaintenance()+", +"+this.defenceChance+"% to defence chance";
    }

}
