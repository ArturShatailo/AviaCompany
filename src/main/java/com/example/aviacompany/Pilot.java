package com.example.aviacompany;

public class Pilot {

    private double salary;
    private String type;

    public Pilot(double salary, String type) {
        this.salary = salary;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString(){
        return this.type;
    }


}
