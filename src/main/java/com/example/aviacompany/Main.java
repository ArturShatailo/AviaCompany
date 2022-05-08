package com.example.aviacompany;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {

    public static Company company;
    public static Menu m;

    public static void main(String[] args) {

        System.out.println("You are an Avia Company founder and now you're going to make your business alive.\n" +
                "Please choose the name of your Company: ");
        String name = Tech.GetInputStringFunction();

        //Defaults
        company = new Company(100000.0, name);
        company.getCivilAircrafts().add(new Aerobus747(5000.0, 130, 10, 130));
        company.getCivilPilots().add(new CivilPilot(500.0, 5));

        System.out.println("Great, now you are 100% shareholder of " + company.getName() + " with start capital of: $" +
                company.getCapital() + "\nBy default "+showKit()+
                "\nYou can build 4 types of aircraft and hire 2 types of pilots: \n" + "\nPress the number on keyboard to build.\n");

        callMenu();

    }

    //?????
    public static void StartFactory(MilitaryJet aircraft){
        if(company.getCapital()>=aircraft.getCost()){
            company.getMilitaryAircrafts().add(aircraft);
            company.setCapital(company.getCapital()-aircraft.getCost());
            System.out.println(showKit());
            callMenu();
        }else{
            System.out.println("You have no money.");
            callMenu();
        }
    }

    public static void StartFactory(CivilJet aircraft){
        if(company.getCapital()>=aircraft.getCost()){
            company.getCivilAircrafts().add(aircraft);
            company.setCapital(company.getCapital()-aircraft.getCost());
            System.out.println(showKit());
            callMenu();
        }else{
            System.out.println("You have no money.");
            callMenu();
        }
    }

    public static void StartFactory(MilitaryPilot pilot){
        company.getMilitaryPilots().add(pilot);
        System.out.println(showKit());
        callMenu();
    }

    public static void StartFactory(CivilPilot pilot){
        company.getCivilPilots().add(pilot);
        System.out.println(showKit());
        callMenu();
    }


    public static void callMenu(){

        System.out.println(company.getName()+" balance: $"+ company.getCapital());
        RaptorF22 marf22 = new RaptorF22(8000.0, 100, 15);
        Lightning2F35 mal2f35 = new Lightning2F35(10000.0, 80, 25);
        Aerobus747 caa747 = new Aerobus747(5000.0, 130, 10, 130);
        Boeing777 cab777 = new Boeing777(15000.0, 130, 30, 50, 130, 20);
        MilitaryPilot mp = new MilitaryPilot(1000.0);
        CivilPilot cp = new CivilPilot(500.0, 5);

        m = new Menu(7, new ArrayList<>());

        m.arrayMenu.add(marf22.getInfo());
        m.arrayMenu.add(mal2f35.getInfo());
        m.arrayMenu.add(caa747.getInfo());
        m.arrayMenu.add(cab777.getInfo());
        m.arrayMenu.add(mp.getInfo());
        m.arrayMenu.add(cp.getInfo());
        m.arrayMenu.add("That's enough");

        m.menuBuilder();

        int i = Tech.GetInputFunction();
        if(i==1){
            StartFactory(marf22);
        }else if(i==2){
            StartFactory(mal2f35);
        }else if(i==3){
            StartFactory(caa747);
        }else if(i==4){
            StartFactory(cab777);
        }else if(i==5){
            StartFactory(mp);
        }else if(i==6){
            StartFactory(cp);
        }else if(i==7){
            startSimulation();
        }else{
            System.out.println("There is no such number");
            callMenu();
        }
    }

    public static void startSimulation(){

        System.out.println("Press enter to start simulation");
        Tech.GetInputStringFunction();

        Month month = new Month(0, 0, new ArrayList<>());

        startFlight(month);

    }


    public static void startFlight(Month month){

        Flight flight = new Flight();
        company.getCivilPilots().removeIf(n -> (n.getFlights()==0));

        if(company.getCivilPilots().size()<=0){
            System.out.println("Your civil pilots have no flights this month");
            getResults(month);
        }


        if(company.getCivilPilots().isEmpty()){
            System.out.println("no civil pilots left this month");
            getResults(month);
        }else{
            flight.setCivilPilot(company.getCivilPilots().get(0));
            company.getCivilPilots().get(0).setFlights(company.getCivilPilots().get(0).getFlights()-1);

            if(company.getCivilAircrafts().isEmpty()){
                System.out.println("no civil aircrafts left this month");
                getResults(month);
            }else{
                flight.setCivilAircraft(company.getCivilAircrafts().get(0));

                if(company.getMilitaryPilots().isEmpty()){
                    System.out.println("Be aware, you have no military pilots");
                    flight.setChanceOfDefence(10);
                }else{
                    flight.setMilitaryPilot(company.getMilitaryPilots().get(0));

                    if(company.getMilitaryAircrafts().isEmpty()){
                        System.out.println("Be aware, you have no military aircrafts");
                        flight.setChanceOfDefence(10);
                    }else{
                        for (MilitaryJet aircraft : company.getMilitaryAircrafts()) {
                            flight.setChanceOfDefence(flight.getChanceOfDefence()+aircraft.getDefenceChance());
                        }
                        flight.setMilitaryAircraft(company.getMilitaryAircrafts().get(0));
                    }
                }
            }
        }

//        for (CivilPilot pilot : company.getCivilPilots()) {
//            if(pilot!=null){
//                flight.setCivilPilot(pilot);
//
//                for (CivilJet aircraft : company.getCivilAircrafts()) {
//                    if(aircraft!=null){
//                        flight.setCivilAircraft(aircraft);
//                    }else{
//                        System.out.println("You need more civil aircrafts");
//                        callMenu();
//                        break;
//                    }
//                }
//
//            }else{
//                System.out.println("You need more civil pilots");
//                callMenu();
//                break;
//            }
//        }
//
//        for (MilitaryPilot pilot : company.getMilitaryPilots()) {
//            if(pilot!=null){
//                flight.setMilitaryPilot(pilot);
//
//                for (MilitaryJet aircraft : company.getMilitaryAircrafts()) {
//                    if(aircraft!=null){
//                        flight.setChanceOfDefence(flight.getChanceOfDefence()+aircraft.getDefenceChance());
//                        flight.setMilitaryAircraft(aircraft);
//                    }else{
//                        System.out.println("Be aware, you have no military aircrafts");
//                        flight.setChanceOfDefence(10);
//                        break;
//                    }
//                }
//                break;
//
//            }else{
//                System.out.println("Be aware, you have no military pilots");
//                break;
//            }
//        }

        int chance = Tech.getRandom(0, 100);
        if(chance>=90){
            flight.setStatus("successful");

            flight.setProfitability(flight.getCivilAircraft().calculation());

//            System.out.println(chance);
//            System.out.println(flight);

        }else if(chance<=flight.getChanceOfDefence()){
            if(null != flight.getMilitaryAircraft()){
                flight.setStatus("protected");

                flight.setProfitability(flight.getCivilAircraft().calculation());

                company.getMilitaryAircrafts().remove(flight.getMilitaryAircraft());
                company.getMilitaryPilots().remove(flight.getMilitaryPilot());

//                System.out.println(chance);
//                System.out.println(company.getMilitaryPilots());
//                System.out.println(company.getMilitaryAircrafts());
//                System.out.println(flight);
            }else{
                flight.setStatus("attacked");

                flight.setProfitability(flight.getCivilAircraft().calculation()-((flight.getCivilAircraft().calculation())*2));

                company.getCivilAircrafts().remove(flight.getCivilAircraft());
                company.getCivilPilots().remove(flight.getCivilPilot());

//                System.out.println(chance);
//                System.out.println(company.getCivilPilots());
//                System.out.println(company.getCivilAircrafts());
//                System.out.println(flight);

            }
        }else{
            flight.setStatus("attacked");
            company.getCivilAircrafts().remove(flight.getCivilAircraft());
            company.getCivilPilots().remove(flight.getCivilPilot());

            flight.setProfitability(flight.getCivilAircraft().calculation()-((flight.getCivilAircraft().calculation())*2));

//            System.out.println(chance+"aha");
//            System.out.println(company.getCivilPilots());
//            System.out.println(company.getCivilAircrafts());
//            System.out.println(flight);

        }

        month.getFlights().add(flight);

        startFlight(month);

    }


    public static void getResults(Month month){

        System.out.println(month);

        callMenu();
    }


    public static String showKit(){
        return company.getName()+" has: " + company.getMilitaryAircrafts().toString()+", "+company.getCivilAircrafts().toString()+
                company.getCivilPilots().toString()+", "+ company.getMilitaryPilots().toString();
    }

}


