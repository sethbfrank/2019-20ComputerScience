
/**
 * Write a description of class MultiTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankTester
{
    public static void main (String[] args)
    {
        Bank b1 = new Bank();
        System.out.println(b1);
        Bank b2 = new Bank(new BankAccount("Radia Perlman", 1700.0 ), new BankAccount(), new BankAccount("Alan Turing", 1000.0));
        System.out.println(b2);
        Bank b3 = new Bank(100.00);
        System.out.println(b3);
        Bank b4 = new Bank("Seth Frank", 100.00);
        System.out.println(b4);
        
        System.out.println(b1.calcTotalFunds());
        b1.chargeFees(100.0);
        b1.printAllReports();
        b1.addInterest();
        b1.printAllReports();
        
        System.out.println(b2.calcTotalFunds());
        b2.chargeFees(100.0);
        b2.printAllReports();
        b2.addInterest();
        b2.printAllReports();
        
        System.out.println(b3.calcTotalFunds());
        b3.chargeFees(100.0);
        b3.printAllReports();
        b3.addInterest();
        b3.printAllReports();
        
        System.out.println(b4.calcTotalFunds());
        b4.chargeFees(100.0);
        b4.printAllReports();
        b4.addInterest();
        b4.printAllReports();        
    }
}