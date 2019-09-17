import java.util.Scanner;
/**
 * By RUNNING the code, determine the problems with these methods and discuss possible solutions with a classmate.
 * Then choose a potential solution and test it.
 *
 */
public class MethodswithProblems
{
   /**
    * Given three temperature readings, return the correct average temp
   */ 
    public static double getAverageTemp(double temp1,double temp2, double temp3)
    {
        return (temp1 + temp2 + temp3)/3;
    }
    //change the public static int to public static double
    
    /**
     * prints a message based tiredness that is input
    */
    public static void tiredMessage()
    {
        //you don't need the scanner since the user is already prompted to input a variable before
        System.out.print("Are you tired? ");
        Scanner myScanner = new Scanner(System.in);
        boolean isTired = myScanner.nextBoolean();
        myScanner.nextLine();
        if(isTired)
            System.out.println("You need to get more sleep.");
        else
            System.out.println("Good you are sleeping well. Keep it up!");
        return;
    }
    
    
    /**
     * Given first and last name as String(text) inputs), return a String of the form
     * last comma first
     */
    public static String reverseName(String first, String last)
    {
        //first = "";
        //last = "";
        //String result = "";
        String result = last + " , " + first;
        return result;
    }
    
    
    //main has problems too - fix them as well
    public static void main()
    {
         System.out.println(getAverageTemp(100.5,88.0,79.4));
         System.out.println(getAverageTemp(50,63.5,47.7));
         System.out.println(getAverageTemp(70.0,70.0,70.0));
               
         tiredMessage();
         //tiredMessage(false);
         System.out.println(reverseName("Radia","Perlman"));
    }
}

