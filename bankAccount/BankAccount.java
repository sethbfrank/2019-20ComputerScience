
/**
 * A simple bank account
 *
 * @author (Seth Frank)
 * @version (1.0)
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
        //balance = 1.0;
        //owner = "Seth Frank";
        
        balance = start;
        owner = myOwner;
    }
    
    //methods
    public double getBalance()
    {
        return balance;
    }
    public void deposit(double amount)
    {
        balance = balance + amount;
    }
    public void withdraw(double amount)
    {
        balance = balance - amount;
    }
    public void printInfo()
    {
        System.out.println("This is the balance: $" + balance);
        System.out.println("Account owner: " + owner);
    }
    public void addInterest()
    {
        System.out.println("The interest rate is 2%");
        balance = balance + balance * 0.02;
    }
    
}
