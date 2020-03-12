public class LoudTurkey extends Turkey
{
    //fields

    //constructors
    public LoudTurkey()
    {
        super();
    }

    public LoudTurkey(String name)
    {
        super(name);
    }

    //methods
    public String speak()
    {
        return super.speak() + " " + super.speak();
    }

    public boolean urinate()
    {
        return super.urinate();
    }
}