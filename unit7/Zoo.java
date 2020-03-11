public class Zoo
{
    //fields
    private Pet[] theZoo;

    //constructors
    public Zoo()
    {
        theZoo = new Pet[10];
        for(int i = 0; i < 10; i++)
        {
            if(i < 5)
            {
                theZoo[i] = new LoudTurkey();
            } else {
                theZoo[i] = new Turkey();
            }            
        }
        
    }

    public Zoo(int len)
    {
        double num;
        theZoo = new Pet[len];
        for(int i = 0; i < len; i++)
        {
            num = Math.random();
            if(num < 0.5)
            {
                theZoo[i] = new LoudTurkey();
            } else {
                theZoo[i] = new Turkey();
            }
        }
    }

    //methods
    public void soundOff()
    {
        for(Pet pet : theZoo)
        {
            System.out.println(pet.speak());
        }
    }
}