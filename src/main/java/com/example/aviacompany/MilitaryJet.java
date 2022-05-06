package com.example.aviacompany;

public class MilitaryJet extends Aircraft{

    private int defenceChance;

    public MilitaryJet(String model, double cost, double monthlyMaintenance, int defenceChance) {

        super("Military", model, cost, monthlyMaintenance);
        this.defenceChance = defenceChance;
    }

    public int getDefenceChance() {
        return defenceChance;
    }

    @Override
    public void getInfo(){
        System.out.println("Type: "+this.getUseArea()+", Model: "+this.getModel()+", Cost: "+this.getCost()+", Monthly maintenance: -$"+this.getMonthlyMaintenance()+", +"+this.defenceChance+"% to defence chance");
    }

}
