import java.util.ArrayList;
import java.util.Arrays;

public class Practice
{
    public static void main(String[] args)
    {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums = (ArrayList<Integer>) Arrays.asList(10, 8, 5, 7, 13, 14, 16, 5);
        for(int num : nums)
        {
            System.out.println(num);
        }
    }
}