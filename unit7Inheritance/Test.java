public class Test
{
    public static void main(String[] args)
    {
        // Zoo z1 = new Zoo(10);
        // System.out.println(z1.soundOff());

        LoudTurkey t1 = new LoudTurkey();
        System.out.println(t1.speak());

        Zoo z1 = new Zoo();
        z1.soundOff();
        z1.petsUrinate();
    }
}

