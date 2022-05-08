package com.example.aviacompany;

public class MilitaryPilot extends Pilot implements GeneralPilot{

    public MilitaryPilot(double salary) {
        super(salary, "Military");
    }

    public String getInfo(){
        return "Type: "+this.getType()+" pilot, salary: "+this.getSalary();
    }

}
