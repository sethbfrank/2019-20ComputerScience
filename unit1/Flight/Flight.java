/*
 * This is an example of a very simple Flight class.
 * It could be connected to a larger Airport class.
 * However, this is just suppose to represent one part of the Airport class.
 * 
 * Author: Seth Frank
 * Version: 1.0
 */

import java.util.ArrayList;
import java.util.Random;

public class Flight
{
   //fields
   private String airline;
   private int flightNum;
   private int gateNum;
   private String seat;
   private String departingAirport;
   private String arrivingAirport;

   //constructors
   public Flight()
   {
       airline = "Southwest";
       flightNum = 238;
       gateNum = 4;
       seat = "6F";
       departingAirport = "BDL";
       arrivingAirport = "MCO";
   }

   public Flight(String myAirline, int myFlightNum, int myGateNum, String mySeat, String myDeparture, String myArrival)
   {
       airline = myAirline;
       flightNum = myFlightNum;
       gateNum = myGateNum;
       seat = mySeat;
       departingAirport = myDeparture;
       arrivingAirport = myArrival;
   }

   public Flight(String myAirline, String myDeparture, String myArrival, String mySeat)
   {
       airline = myAirline;
       
       Random randFlightNum = new Random();
       flightNum = randFlightNum.nextInt(9999);
       Random randGateNum = new Random();
       gateNum = randGateNum.nextInt(99);

       departingAirport = myDeparture;
       arrivingAirport = myArrival;        
       seat = mySeat;
   }

   //accessor methods
   public String getAirline()
   {
       return airline;
   }
   public int getFlightNum()
   {
       return flightNum;
   }
   public int getGateNum()
   {
       return gateNum;
   }
   public String getSeat()
   {
       return seat;
   }
   public String getDeparture()
   {
       return departingAirport;
   }
   public String getArrival()
   {
       return arrivingAirport;
   }

   //mutator methods
   public String setDeparture(String newDeparture)
   {
       int len = newDeparture.length();
       if(len == 3)
       {
           departingAirport = newDeparture;
           return departingAirport;
       }else{
           System.out.println("Please use the correct format.");   
           return newDeparture;
       }
       
   }
   public String setArrival(String newArrival)
   {
       int len = newArrival.length();
       if(len == 3)
       {
           arrivingAirport = newArrival;
           return arrivingAirport;
       }else{
           System.out.println("Please use the correct format.");   
           return newArrival;
       }
       
   }

   //more complex methods
   public void flightChange(String newArrival)
   {
       
        //flight num
        Random randFlightNum = new Random();
        flightNum = randFlightNum.nextInt(9999);
        //gate num
        Random randGateNum = new Random();
        gateNum = randGateNum.nextInt(99);
       
        //seat letter
        ArrayList<String> seatList = new ArrayList<String>();
        seatList.add("A");
        seatList.add("B");
        seatList.add("C");
        seatList.add("D");
        seatList.add("E");
        seatList.add("F");
        Random randSeatLetter = new Random();
        int seatLetterLocation = randSeatLetter.nextInt(6);

        //seat num
        Random randSeatNum = new Random();
        int seatNum = randSeatNum.nextInt(30);

        //seat num and letter
        seat = (seatNum + seatList.get(seatLetterLocation));

        arrivingAirport = newArrival;
   }
   public void flightCanceled()
   {
       airline = "Canceled";
       flightNum = 0;
       gateNum = 0;
       seat = "Canceled";
       departingAirport = "Canceled";
       arrivingAirport = "Canceled";
   }

   //print method
   public void printFlightInfo()
   {
       System.out.println("You are on " + airline + " flight " + flightNum + ".");
       System.out.println("You are boarding at gate "+ gateNum + ".");
       System.out.println("You are sitting in seat " + seat + ".");
       System.out.println("You are departing from " + departingAirport + " and arriving in " + arrivingAirport + ".");
       System.out.println("");
   }

}