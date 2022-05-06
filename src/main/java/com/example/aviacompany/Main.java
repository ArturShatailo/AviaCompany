package com.example.aviacompany;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Company company;

    public static void main(String[] args) {

        System.out.println("You are an Avia Company founder and now you're going to make your business alive.\n" +
                "Please choose the name of your Company: ");
        String name = Tech.GetInputStringFunction();

        company = new Company(100000.0, name);

        System.out.println("Great, now you are 100% shareholder of " + company.getName() + " with start capital of: $" +
                company.getCapital() + "\nYou can build 4 types of aircraft: \n" + "\nPress the number on keyboard to build.\n");

        callMenu();

    }

    public static void getAircraftInfo(Aircraft aircraft){
        aircraft.getInfo();
    }


    //?????
    public static void buildAircraft(Aircraft aircraft){
        if(company.getCapital()>=aircraft.getCost()){
            company.getAircrafts().add(aircraft);
            company.setCapital(company.getCapital()-aircraft.getCost());
            System.out.println("Your air fleet: "+company.getAircrafts().toString());
            callMenu();
        }else{
            System.out.println("You have no money.");
            startSimulation();
        }
    }

    public static void callMenu(){
        System.out.println(company.getName()+" balance: $"+ company.getCapital());
        System.out.print("1) ");
        getAircraftInfo(new MilitaryJet("Raptor F-22", 8000.0, 100, 10));
        System.out.print("2) ");
        getAircraftInfo(new MilitaryJet("Raptor F-35", 10000.0, 80, 15));
        System.out.print("3) ");
        getAircraftInfo(new CivilJet("Aerobus747", 5000.0, 130, 10, 130));
        System.out.print("4) ");
        getAircraftInfo(new CivilJet("Boeing777", 15000.0, 130, 30, 50, 130, 20));
        System.out.print("5) Enough");
        menuSwitcher();
    }

    public static void menuSwitcher(){
        int i = Tech.GetInputFunction();
        if(i==1){
            buildAircraft(new MilitaryJet("Raptor F-22", 8000.0, 100, 10));
        }else if(i==2){
            buildAircraft(new MilitaryJet("Raptor F-35", 10000.0, 80, 15));
        }else if(i==3){
            buildAircraft(new CivilJet("Aerobus747", 5000.0, 130, 10, 130));
        }else if(i==4){
            buildAircraft(new CivilJet("Boeing777", 15000.0, 130, 30, 50, 130, 20));
        }else if(i==5) {

        }else{
            System.out.println("There is no such number");
            callMenu();
        }
    }

    public static void startSimulation(){
        System.out.println("Press enter to start simulation");
    }


}
