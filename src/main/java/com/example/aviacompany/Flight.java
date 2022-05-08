package com.example.aviacompany;

public class Flight {

    private String status; //protected, attacked, successful
    private CivilPilot civilPilot;
    private Aircraft civilAircraft;
    private MilitaryPilot militaryPilot;
    private Aircraft militaryAircraft;
    private int chanceOfAttack;


    public Flight() {

    }

    public Flight(String status, CivilPilot civilPilot, Aircraft civilAircraft, MilitaryPilot militaryPilot, Aircraft militaryAircraft, int chanceOfAttack) {
        this.status = status;
        this.civilPilot = civilPilot;
        this.civilAircraft = civilAircraft;
        this.militaryPilot = militaryPilot;
        this.militaryAircraft = militaryAircraft;
        this.chanceOfAttack = chanceOfAttack;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCivilPilot(CivilPilot civilPilot) {
        this.civilPilot = civilPilot;
    }

    public void setCivilAircraft(Aircraft civilAircraft) {
        this.civilAircraft = civilAircraft;
    }

    public void setMilitaryPilot(MilitaryPilot militaryPilot) {
        this.militaryPilot = militaryPilot;
    }

    public void setMilitaryAircraft(Aircraft militaryAircraft) {
        this.militaryAircraft = militaryAircraft;
    }

    public void setChanceOfAttack(Integer chanceOfAttack) {
        this.chanceOfAttack = chanceOfAttack;
    }

    public int getChanceOfAttack() {
        return chanceOfAttack;
    }
}
