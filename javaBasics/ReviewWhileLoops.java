import java.util.Scanner;

public class ReviewWhileLoops
{
    public static void main()
    {
    //add code in here
    Scanner someScanner = new Scanner(System.in);
    
    int count = 1;
    
        while(count <= 100)
        {
            System.out.println(count);
            
            System.out.print("Do you want to continue? ");
            boolean continueCount = someScanner.nextBoolean();
            someScanner.nextLine();
            
            if(continueCount == false)
            {
                break;
            }
            count++;
        }
    
    }
}
