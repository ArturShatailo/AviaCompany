package com.example.aviacompany;

import java.util.ArrayList;

public class Main {

    public static Company company;
    public static Menu m;

    public static void main(String[] args) {

        System.out.println("You are an Avia Company founder and now you're going to make your business alive.\n" +
                "Please choose the name of your Company: ");
        String name = Tech.GetInputStringFunction();

        //Default statements of te Company
        company = new Company(100000.0, name);
        company.getCivilAircrafts().add(new Aerobus747(5000.0, 200, 100, 130, 1));
        company.getCivilPilots().add(new CivilPilot(500.0, 2));

        System.out.println("Great, now you are 100% shareholder of " + company.getName() + " with start capital of: $" +
                company.getCapital() + "\nBy default "+showKit()+
                "\nYou can build 4 types of aircraft and hire 2 types of pilots: \n" + "\nPress the number on keyboard to build.\n");


        //Start menu of Aircrafts and Pilots creating
        callMenu();

    }

    //?????

    //StartFactory ctreated different objects and adds them to Company's ArrayLists according to the Object class
    //Also checking of balance is providing in this method.
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

        //Creating all possible objects for further menu filling and adding them into Company's collections.
        RaptorF22 marf22 = new RaptorF22(8000.0, 500, 55);
        Lightning2F35 mal2f35 = new Lightning2F35(10000.0, 800, 75);
        Aerobus747 caa747 = new Aerobus747(5000.0, 200, 100, 130, 1);
        Boeing777 cab777 = new Boeing777(15000.0, 500, 150, 400, 130, 20, 2);
        MilitaryPilot mp = new MilitaryPilot(1000.0);
        CivilPilot cp = new CivilPilot(500.0, 2);

        //New Menu object creating
        m = new Menu(7, new ArrayList<>());

        //Filling arrayList for menu creating
        m.arrayMenu.add(marf22.getInfo());
        m.arrayMenu.add(mal2f35.getInfo());
        m.arrayMenu.add(caa747.getInfo());
        m.arrayMenu.add(cab777.getInfo());
        m.arrayMenu.add(mp.getInfo());
        m.arrayMenu.add(cp.getInfo());
        m.arrayMenu.add("That's enough");

        //Menu builder method calling
        m.menuBuilder();

        //Catching of customer's choice.
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

        //New Month object creating
        Month month = new Month(0, 0, new ArrayList<>());

        //Setting the 'expenses' field in Month object
        month.setExpenses(
                -company.getMilitaryAircrafts().stream().mapToDouble(Aircraft::getMonthlyMaintenance).sum()-
                company.getCivilAircrafts().stream().mapToDouble(Aircraft::getMonthlyMaintenance).sum()-
                company.getMilitaryPilots().stream().mapToDouble(Pilot::getSalary).sum()-
                company.getCivilPilots().stream().mapToDouble(Pilot::getSalary).sum());

        //Start Flight method
        startFlight(month);

    }


    public static void startFlight(Month month){

        //Creating of new Flight object
        Flight flight = new Flight();


        //Further validation checks for Civil and Military Jets and Pilots availability and filling Flight object with
        //these Objects (if possible)

        for (CivilPilot pilot : company.getCivilPilots()) {
            if (pilot != null) {
                if (pilot.getFlights() > 0) {
                    flight.setCivilPilot(pilot);
                    pilot.setFlights(pilot.getFlights() - 1);
                    break;
                }
            }
        }
        for (CivilJet aircraft : company.getCivilAircrafts()) {
            if (aircraft != null) {
                if (aircraft.getFlights() > 0) {
                    flight.setCivilAircraft(aircraft);
                    aircraft.setFlights(aircraft.getFlights() - 1);
                    break;
                }
            }
        }

        if(flight.getCivilPilot() == null || flight.getCivilAircraft() == null){
            System.out.println("month is over because of civil aircrafts or pilots absence");

            //Back default value of flights field for Aircrafts and Pilots if the Month is over (There are no CivilJet and
            // CivilPilot for Flight implementing
            company.getCivilPilots().forEach(civilPilot -> civilPilot.setFlights(civilPilot.getDefaultFlights()));
            company.getCivilAircrafts().forEach(civilJet -> civilJet.setFlights(civilJet.getDefaultFlights()));

            //Month is over, get results
            getResults(month);
        }

        //The same validation but for Military Aircrafts and Pilots
        for (MilitaryPilot pilot : company.getMilitaryPilots()) {
            if (pilot != null) {
                flight.setMilitaryPilot(pilot);

                for (MilitaryJet aircraft : company.getMilitaryAircrafts()) {
                    if(aircraft!=null){
                        flight.setMilitaryAircraft(aircraft);
                    }else{
                        System.out.println("Be aware, you have no military aircrafts");
                        flight.setChanceOfDefence(10);
                    }
                    break;
                }
            }else{
                System.out.println("Be aware, you have no military pilots");
                flight.setChanceOfDefence(10);
            }
            break;
        }

        //Setting Flight chance of defence according to the Military aircrafts and Military pilots availability.
        flight.setChanceOfDefence(
                (company.getMilitaryAircrafts().stream().mapToInt(MilitaryJet::getDefenceChance).sum())
                        *company.getMilitaryPilots().size());

        //Random of possible attack and further scenarios for different chance positions
        int chance = Tech.getRandom(0, 100);
        if(chance>=90){
            flight.setStatus("successful");

            flight.setProfitability(flight.getCivilAircraft().calculation());

        }else if(chance<=flight.getChanceOfDefence()){
            if(null != flight.getMilitaryAircraft()){
                flight.setStatus("protected");

                flight.setProfitability(flight.getCivilAircraft().calculation());

                company.getMilitaryAircrafts().remove(flight.getMilitaryAircraft());
                company.getMilitaryPilots().remove(flight.getMilitaryPilot());

            }else{
                flight.setStatus("attacked");

                flight.setProfitability(flight.getCivilAircraft().calculation()-((flight.getCivilAircraft().calculation())*2));

                company.getCivilAircrafts().remove(flight.getCivilAircraft());
                company.getCivilPilots().remove(flight.getCivilPilot());
            }
        }else{
            flight.setStatus("attacked");
            company.getCivilAircrafts().remove(flight.getCivilAircraft());
            company.getCivilPilots().remove(flight.getCivilPilot());

            flight.setProfitability(flight.getCivilAircraft().calculation()-((flight.getCivilAircraft().calculation())*2));
        }

        //Add this Flight to the current Month's flights collection
        month.getFlights().add(flight);

        startFlight(month);

    }


    public static void getResults(Month month){

        //setting Month's field profit as a sum of profitability of each Flight from flights collection of Month
        month.setProfit(
                month.getFlights().stream().mapToDouble(Flight::getProfitability).sum());

        //updating of Company's capital field
        company.setCapital(company.getCapital()+month.getExpenses()+month.getProfit());

        System.out.println("Monthly journal of flights: "+ month);
        System.out.println("\n"+company.getName()+" has "+(month.getProfit()+month.getExpenses())+"$ in this month.\n");

        //Call menu again to create something
        callMenu();
    }


    public static String showKit(){
        return company.getName()+" has: " + company.getMilitaryAircrafts().toString()+", "+company.getCivilAircrafts().toString()+
                company.getCivilPilots().toString()+", "+ company.getMilitaryPilots().toString();
    }

}


