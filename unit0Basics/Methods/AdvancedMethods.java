

public class AdvancedMethods
{
    
    public static void main()
    {
        printNumbers(5,18);
        average(7,53,26);
        remainderOfNumbers(16,8);        
    }

    
    public static void printNumbers(int num1, int num2)
    {
        System.out.println(num1);
        System.out.println(num2);
        return;
    }
    
    public static int average(int num1, int num2, int num3)
    {
        int average = ((num1 + num2 + num3)/3);
        System.out.println(average);
        return average;
    }
    
    public static int remainderOfNumbers(int num1, int num2)
    {
        int remainder = num1%num2;
        System.out.println(remainder);
        return remainder;
    }
}
