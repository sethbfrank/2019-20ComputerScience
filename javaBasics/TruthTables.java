import java.util.Scanner;

public class TruthTables
{
    public static void main()
    {
    //add code in here
    Scanner someScanner = new Scanner(System.in);
    
    System.out.print("Do you have a dog? ");
    boolean hasDog = someScanner.nextBoolean();
    someScanner.nextLine();
    System.out.println(hasDog);
    
    System.out.print("Do you have a cat? ");
    boolean hasCat = someScanner.nextBoolean();
    someScanner.nextLine();
    System.out.println(hasCat);
    
    System.out.print("Do you have a bird? ");
    boolean hasBird = someScanner.nextBoolean();
    someScanner.nextLine();
    System.out.println(hasBird);
    
    }
}
