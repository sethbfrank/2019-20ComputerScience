/*
This is the tester for the flight class.
*/

public class FlightTester
{
    public static void main (String[] args)
    {
        //Object 1
        Flight f1 = new Flight();
        System.out.println(f1);

        //Accessor methods
        System.out.println(f1.getAirline());
        System.out.println(f1.getFlightNum());
        System.out.println(f1.getGateNum());
        System.out.println(f1.getSeat());
        System.out.println(f1.getDeparture());
        System.out.println(f1.getArrival());

        // Mutators
        f1.setDeparture("JFK");
        f1.setArrival("BOS");
        f1.printFlightInfo();

        // More complex methods
        f1.flightChange("LGA");
        f1.printFlightInfo();

        f1.flightCanceled();
        f1.printFlightInfo();

        


        //Object 2
        Flight f2 = new Flight("American Airlines", 7655, 45, "25D", "DFW", "LAX");
        System.out.println(f2);

        //Accessor methods
        System.out.println(f2.getAirline());
        System.out.println(f2.getFlightNum());
        System.out.println(f2.getGateNum());
        System.out.println(f2.getSeat());
        System.out.println(f2.getDeparture());
        System.out.println(f2.getArrival());

        //Mutators
        f2.setDeparture("JFK");
        f2.setArrival("BOS");
        f2.printFlightInfo();

        //More complex methods
        f2.flightChange("LGA");
        f2.printFlightInfo();
        
        f2.flightCanceled();
        f2.printFlightInfo();
        
        


        //Object 3
        Flight f3 = new Flight("JetBlue", "ORD", "MIA","8D");
        System.out.println(f3);

        //Accessor methods
        System.out.println(f3.getAirline());
        System.out.println(f3.getFlightNum());
        System.out.println(f3.getGateNum());
        System.out.println(f3.getSeat());
        System.out.println(f3.getDeparture());
        System.out.println(f3.getArrival());

        //Mutators
        f3.setDeparture("JFK");
        f3.setArrival("BO");
        f3.printFlightInfo();

        //More complex methods
        f3.flightCanceled();
        f3.printFlightInfo();
        
        f3.flightChange("LGA");
        f3.printFlightInfo();       
    }
}