package com.example.aviacompany;

public class MilitaryPilot extends Pilot implements GeneralPilot{

    public MilitaryPilot(double salary) {
        super(salary, "Military pilot");
    }

    public String getInfo(){
        return "Type: "+this.getType()+", salary: "+this.getSalary();
    }

    public Double calculation() {
        return this.getSalary();
    }

}
