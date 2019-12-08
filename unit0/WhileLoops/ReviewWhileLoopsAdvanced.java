import java.util.Scanner;

public class ReviewWhileLoopsAdvanced
{
    public static void main()
    {
    //add code in here
    Scanner someScanner = new Scanner(System.in);
    boolean quit = false;
    
    System.out.println("Type 1 to see a greeting");
    System.out.println("Type 2 to see my favorite color");
    System.out.println("Type 3 to see my favorite class");
    System.out.println("Type 0 to quit");
    
    
    while(quit == false)
    {
        System.out.println("Enter your choice: ");
        int num = someScanner.nextInt();
        someScanner.nextLine();
        
        if(num == 1)
        {
            System.out.println("Hello friend!");
        }
        if(num == 2)
        {
            System.out.println("My favoirte color is orange.");
        }
        if(num == 3)
        {
            System.out.println("My favorite class is a computer science");
        }
        if(num == 0)
        {
            quit = true;
        }
        
    }
    }
}
