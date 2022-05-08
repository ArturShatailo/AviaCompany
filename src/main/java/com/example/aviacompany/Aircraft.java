package com.example.aviacompany;

public class Aircraft {

    private String useArea;
    private String model;
    private double cost;
    private double monthlyMaintenance;


    public Aircraft(String useArea, String model, double cost, double monthlyMaintenance) {
        this.useArea = useArea;
        this.model = model;
        this.cost = cost;
        this.monthlyMaintenance = monthlyMaintenance;
    }

    public Double getCost() {
        return cost;
    }



    public Double getMonthlyMaintenance(){ return monthlyMaintenance; }

    public String getModel() {
        return model;
    }

    public String getUseArea() {
        return useArea;
    }

    @Override
    public String toString(){
        return this.model;
    }

}
