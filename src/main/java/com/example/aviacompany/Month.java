package com.example.aviacompany;

import java.util.ArrayList;

public class Month {

    private double profit;
    private double loss;
    private ArrayList<Flight> flights = new ArrayList<>();

    public Month(){

    }

    public Month(double profit, double loss, ArrayList<Flight> flights) {
        this.profit = profit;
        this.loss = loss;
        this.flights = flights;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public double getLoss() {
        return loss;
    }

    public void setLoss(double loss) {
        this.loss = loss;
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public void setFlights(ArrayList<Flight> flights) {
        this.flights = flights;
    }

    public void calculateProfit(){

    }


    @Override
    public String toString(){
        return this.getFlights() + " " + this.getLoss() + " " + this.getProfit();
    }

}
