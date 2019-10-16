/**
 * This is an example of an airport class.
 * 
 * Author: Seth Frank
 * Version: 1.0
 */

 import java.util.Random;

 public class Airport
 {
    //fields
    private String airline;
    private int flightNum;
    private int gateNum;
    private String seat;
    private String departingAirport;
    private String arrivingAirport;

    //constructors
    public Airport()
    {
        airline = "Southwest";
        flightNum = 238;
        gateNum = 4;
        seat = "6F";
        departingAirport = "BDL";
        arrivingAirport = "MCO";
    }

    public Airport(String myAirline, int myFlightNum, int myGateNum, String mySeat, String myDeparture, String myArrival)
    {
        airline = myAirline;
        flightNum = myFlightNum;
        gateNum = myGateNum;
        seat = mySeat;
        departingAirport = myDeparture;
        arrivingAirport = myArrival;
    }

    public Airport(String myAirline, String myDeparture, String myArrival)
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
    

 }