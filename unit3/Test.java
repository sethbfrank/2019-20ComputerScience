public  class Test
{
    public static void main(String[] args)
    {
        intLimits();
    }
    
    public static void doubleTrouble()
    {
        double sum = 0.0;
        for(int i = 0; i < 20; i++)
        {
            System.out.println(sum);
            sum = sum + 0.4;
        }
    }

    public static void intLimits()
    {
        long value = 1;
        for(int i = 0; i < 40; i++)
        {
            System.out.println("10 to the " + i + " = "  + value);
            value = value*2;
        }
    }
}