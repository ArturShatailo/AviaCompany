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

}
