
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
        
        b1.calcTotalFunds();
        b1.chargeFees(100.0);
    }
}