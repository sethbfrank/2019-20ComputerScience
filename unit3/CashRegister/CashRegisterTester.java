import java.util.Scanner;

public class CashRegisterTester
{
    public static void main(String[] args)
    {     
        CashRegister r1 = new CashRegister();
        r1.printRegisterStatus();
        r1.addMoney(0, 0, 5, 0, 5, 0, 0, 10);
        r1.printRegisterStatus();

        Scanner someScanner = new Scanner(System.in);
        System.out.print("How much money do you want? ");
        double num = someScanner.nextDouble();
        someScanner.nextLine();
        //System.out.println(num);

        r1.removeOptimumMoneyPossible(num);
        r1.printRegisterStatus();


        CashRegister r2 = new CashRegister(5,8,6,1,9,10,8,7);
        r2.printRegisterStatus();
        r2.addMoney(0, 0, 5, 0, 5, 0, 0, 10);
        r2.printRegisterStatus();

        someScanner = new Scanner(System.in);
        System.out.print("How much money do you want? ");
        num = someScanner.nextDouble();
        someScanner.nextLine();

        r2.removeOptimumMoneyPossible(num);
        r2.printRegisterStatus();


        CashRegister r3 = new CashRegister(80);
        r3.printRegisterStatus();
        r3.addMoney(0, 0, 5, 0, 5, 0, 0, 10);
        r3.printRegisterStatus();

        someScanner = new Scanner(System.in);
        System.out.print("How much money do you want? ");
        num = someScanner.nextDouble();
        someScanner.nextLine();

        r3.removeOptimumMoneyPossible(num);
        r3.printRegisterStatus();

        
    }
}