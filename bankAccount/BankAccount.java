
/**
 * A simple bank account
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    //fields
    private double balance;
    private String owner;

    //constructors
    public BankAccount(String myOwner, double start)
    {
        // initialise instance variables
        balance = 1.0;
        owner = "Seth Frank";
        
        balance = start;
        owner = myOwner;
    }
    
    //methods
    public double getBalance()
    {
        return balance;
    }
    public void deposit(double howMuch)
    {
        
    }
    
}
