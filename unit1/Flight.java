/*
 * This is an example of a very simple airport class.
 * It could be connected to other classes, however, this was made to be very simple.
 * 
 * Author: Seth Frank
 * Version: 1.0
 */

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

   public Flight(String myAirline, String myDeparture, String myArrival)
   {
       airline = myAirline;
       
       Random randFlightNum = new Random();
       flightNum = randFlightNum.nextInt(9999);
       Random randGateNum = new Random();
       gateNum = randGateNum.nextInt(99);
       //Random randSeatNum = new Random();
       //int seatNum = randSeatNum.nextInt(30);
       seat = "6F";

       departingAirport = myDeparture;
       arrivingAirport = myArrival;        
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
       departingAirport = newDeparture;
       return departingAirport;
   }
   public String setArrival(String newArrival)
   {
       arrivingAirport = newArrival;
       return arrivingAirport;
   }

   //more complex methods
   public void flightChange(String newArrival)
   {
       Random randFlightNum = new Random();
       flightNum = randFlightNum.nextInt(9999);
       Random randGateNum = new Random();
       gateNum = randGateNum.nextInt(99);
       arrivingAirport = newArrival;
   }
   public void flightCanceled()
   {
       airline = "Canceled";
       flightNum = null;
       gateNum = null;
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
   }

}