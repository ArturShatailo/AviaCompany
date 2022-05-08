package com.example.aviacompany;

public class Flight {

    private String status; //protected, attacked, successful
    private CivilPilot civilPilot;
    private CivilJet civilAircraft;
    private MilitaryPilot militaryPilot;
    private MilitaryJet militaryAircraft;
    private int chanceOfDefence;
    private double profitability;


    public Flight() {

    }

    public Flight(String status, CivilPilot civilPilot, CivilJet civilAircraft, MilitaryPilot militaryPilot, MilitaryJet militaryAircraft, int chanceOfAttack) {
        this.status = status;
        this.civilPilot = civilPilot;
        this.civilAircraft = civilAircraft;
        this.militaryPilot = militaryPilot;
        this.militaryAircraft = militaryAircraft;
        this.chanceOfDefence = chanceOfAttack;

    }

    public double getProfitability() {
        return profitability;
    }

    public void setProfitability(double profitability) {
        this.profitability = profitability;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCivilPilot(CivilPilot civilPilot) {
        this.civilPilot = civilPilot;
    }

    public void setCivilAircraft(CivilJet civilAircraft) {
        this.civilAircraft = civilAircraft;
    }

    public void setMilitaryPilot(MilitaryPilot militaryPilot) {
        this.militaryPilot = militaryPilot;
    }

    public void setMilitaryAircraft(MilitaryJet militaryAircraft) {
        this.militaryAircraft = militaryAircraft;
    }

    public void setChanceOfDefence(Integer chanceOfDefence) {
        this.chanceOfDefence = chanceOfDefence;
    }

    public int getChanceOfDefence() {
        return chanceOfDefence;
    }

    public String getStatus() {
        return status;
    }

    public CivilPilot getCivilPilot() {
        return civilPilot;
    }

    public CivilJet getCivilAircraft() {
        return civilAircraft;
    }

    public MilitaryPilot getMilitaryPilot() {
        return militaryPilot;
    }

    public MilitaryJet getMilitaryAircraft() {
        return militaryAircraft;
    }

    @Override
    public String toString(){
        return status+" "+civilPilot.toString()+" "+civilAircraft.toString()+" "+militaryPilot.toString()+" "+militaryAircraft.toString()+" "+chanceOfDefence+" "+profitability;
    }

}
