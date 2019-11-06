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
        lead = new Car("Dodge", "Monaco", "White", 300000.0);
        middle = new Car("Subaru", "Outback", "Blue", 3000.0);
        end = new Car("Ford", "Mustang", "Black", 0.0);
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
        temp = lead;
        lead = middle;
        middle = end;
        end = temp;
        
    }
    public void replaceCar(Car newCar, int position)
    {
        if(position == 1)
        {
            newCar = lead;
        }
        else if(position == 2)
        {
            newCar = middle;
        }
        else if(position == 3)
        {
            newCar = end;
        }       
    }
    public void printConvoyInfo()
    {
        //done
    }


}