package com.example.aviacompany;

import java.util.ArrayList;

public class Month {

    private double profit;
    private double expenses;
    private ArrayList<Flight> flights = new ArrayList<>();

    public Month(){

    }

    public Month(double profit, double expenses, ArrayList<Flight> flights) {
        this.profit = profit;
        this.expenses = expenses;
        this.flights = flights;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public double getExpenses() {
        return expenses;
    }

    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    @Override
    public String toString(){
        return this.getFlights() + " " + this.getExpenses() + " " + this.getProfit();
    }

}
