public class Turkey extends Pet
{
    //fields


    //constructors
    public Turkey()
    {
        super("Charlie");
    }

    public Turkey(String theName)
    {
        super(theName);
    }

    //methods
    public String speak()
    {
        return "Gobble Gobble";
    }

    public boolean urinate()
    {
        return Math.random() < 0.3;
    }
    
}