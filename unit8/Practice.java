import java.util.ArrayList;
import java.util.Arrays;

public class Practice
{
    public static int timesTwo(int x)
    {
        return x*2;
    }

    public static void main(String[] args)
    {
        Integer val = 10;
        int result1 = timesTwo(val);
        Integer result2 = result1;
        System.out.print(result2);
    }
}