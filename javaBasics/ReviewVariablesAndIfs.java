import java.util.Scanner;

public class ReviewVariablesAndIfs
{
    public static void main()
    {
    //add code in here
    //int num; declaration
    //num = 0; assignment, initialization
    //num = 1; assignment
    
    Scanner someScanner = new Scanner(System.in);
    
    System.out.print("What is your age: ");
    int num = someScanner.nextInt();
    someScanner.nextLine();
    System.out.println(num);
    
    System.out.print("How many AP's are you taking: ");
    num = someScanner.nextInt();
    someScanner.nextLine();
    //System.out.println(num);
    
    if(num <= 3)
        {
            System.out.println("Good job!");
        }else{
            System.out.println("That's too many!");
            }
            
    System.out.print("Do you play an instrument? (Enter true or false): ");
    boolean answer = someScanner.nextBoolean();
    someScanner.nextLine();
    System.out.println(answer);
    
    if(answer == true)
        {
            System.out.println("Yeah!");
        }else{
            System.out.println("You should play an instrument.");
        }
        
    if(num <= 3)
        {
            if(answer == true)
            {
                System.out.println("Nice variety of classes!");
            }
            if(answer == false)
            {
                System.out.println("You should play an instrument.");
            }      
        
        }else{
            if(answer == true)
            {
                System.out.println("You must be taking a ton of classes!");
            }
            if(answer == false)
            {
                System.out.println("You should take a music class instead of an AP.");
            }      
        }
    }
}
