public class MiniConvoy
{
    //fields
    private Car lead;
    private Car middle;
    private Car end;
    private String currentDestination;


    //constructors
    public MiniConvoy()
    {
        currentDestination = "Chicago";
        lead = ("Dodge", "Monaco", "White", 300000.0);
        middle = ("Subaru", "Outback", "Blue", 3000.0);
        end = ("Ford", "Mustang", "Black", 0.0);
    }
    public MiniConvoy(String currentDestination, Car lead, Car middle, Car end)
    {
        this.currentDestination = currentDestination;
        this.lead = lead;
        this.middle = middle;
        this.end = end;
    }


    //methods
    public String getDestination()
    {
        return currentDestination;
    }
    public String setDestination(String currentDestination)
    {
        this.currentDestination = currentDestination;
        return currentDestination;
    }
    public void travel(double mileage)
    {
        lead.drive(mileage);
        middle.drive(mileage);
        end.drive(mileage);
    }
    public void swapOrder()
    {
        Car temp;
        
    }
    public void replaceCar()
    {

    }
    public void printConvoyInfo()
    {

    }


}