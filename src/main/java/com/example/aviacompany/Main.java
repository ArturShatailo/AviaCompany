package com.example.aviacompany;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Company company;
    public static Menu m;

    public static void main(String[] args) {

        System.out.println("You are an Avia Company founder and now you're going to make your business alive.\n" +
                "Please choose the name of your Company: ");
        String name = Tech.GetInputStringFunction();

        company = new Company(100000.0, name);

        System.out.println("Great, now you are 100% shareholder of " + company.getName() + " with start capital of: $" +
                company.getCapital() + "\nYou can build 4 types of aircraft: \n" + "\nPress the number on keyboard to build.\n");

        callAircraftMenu();

    }

    //?????
    public static void buildAircraft(Aircraft aircraft){
        if(company.getCapital()>=aircraft.getCost()){
            company.getAircrafts().add(aircraft);
            company.setCapital(company.getCapital()-aircraft.getCost());
            System.out.println("Your air fleet: "+company.getAircrafts().toString());
            callAircraftMenu();
        }else{
            System.out.println("You have no money.");
            callAircraftMenu();
        }
    }

    public static void buildPilot(Pilot pilot){

        company.getPilots().add(pilot);
        System.out.println("The team of "+company.getName()+" is: "+ company.getPilots().toString());
        callPilotMenu();
    }

    public static void callAircraftMenu(){
        System.out.println(company.getName()+" balance: $"+ company.getCapital());
        m = new Menu(5, new ArrayList<>());
        m.arrayMenu.add(new RaptorF22(8000.0, 100, 10).getInfo());
        m.arrayMenu.add(new Lightning2F35(10000.0, 80, 15).getInfo());
        m.arrayMenu.add(new Aerobus747(5000.0, 130, 10, 130).getInfo());
        m.arrayMenu.add(new Boeing777(15000.0, 130, 30, 50, 130, 20).getInfo());
        m.arrayMenu.add("That's enough");
        m.menuBuilder();

//        System.out.println("1) "+new RaptorF22(8000.0, 100, 10).getInfo());
//        System.out.println("2) "+new Lightning2F35(10000.0, 80, 15).getInfo());
//        System.out.println("3) "+new Aerobus747(5000.0, 130, 10, 130).getInfo());
//        System.out.println("4) "+new Boeing777(15000.0, 130, 30, 50, 130, 20).getInfo());
//        System.out.println("5) That's enough");
        menuAircraftSwitcher();
    }

    public static void callPilotMenu(){

        m = new Menu(3, new ArrayList<>());
        m.arrayMenu.add(new MilitaryPilot(1000.0).getInfo());
        m.arrayMenu.add(new CivilPilot(500.0, 5).getInfo());
        m.arrayMenu.add("That's enough");
        m.menuBuilder();
//        System.out.println("1) "+new MilitaryPilot(1000.0).getInfo());
//        System.out.println("2) "+new CivilPilot(500.0, 5).getInfo());
//        System.out.println("3) That's enough");
        menuPilotSwitcher();
    }

    public static void menuAircraftSwitcher(){
        int i = Tech.GetInputFunction();
        if(i==1){
            buildAircraft(new RaptorF22(8000.0, 100, 10));
        }else if(i==2){
            buildAircraft(new Lightning2F35(10000.0, 80, 15));
        }else if(i==3){
            buildAircraft(new Aerobus747(5000.0, 130, 10, 130));
        }else if(i==4){
            buildAircraft(new Boeing777(15000.0, 130, 30, 50, 130, 20));
        }else if(i==5) {
            System.out.println("Now you can hire more pilots (civil pilot brings 5 flights per month).");
            callPilotMenu();
        }else{
            System.out.println("There is no such number");
            callAircraftMenu();
        }
    }

    public static void menuPilotSwitcher(){
        int i = Tech.GetInputFunction();
        if(i==1){
            buildPilot(new MilitaryPilot(1000));
        }else if(i==2){
            buildPilot(new CivilPilot(500, 5));
        }else if(i==3){
            startSimulation();
        }else{
            System.out.println("There is no such number");
            callPilotMenu();
        }
    }

    public static void startSimulation(){
        System.out.println("Press enter to start simulation");
    }

}
