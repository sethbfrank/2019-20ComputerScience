
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
    public BankAccount()
    {
        balance = 1.0;
        owner = "Seth Frank";        
    }
    public BankAccount(String myOwner, double start)
    {
        balance = start;
        owner = myOwner;
    }
    public BankAccount(String myOwner)
    {
        balance = 1.0;
        owner = myOwner;
    }
    public BankAccount(double start)
    {
        balance = start;
        owner = "Seth Frank";
    }
    
    
    //methods
    public double getBalance() // accessor method
    {
        return balance;
    }
    public String getOwner()
    {
        return owner;
    }
    public void deposit(double amount)
    {
        if(amount >= 0)
        {
            balance = balance + amount;
        }else{
            System.out.println("Please input a positive number");
        }
    }
    public void withdraw(double amount)
    {
        if(amount >= 0)
        {
            balance = balance - amount;
        }else{
            System.out.println("Please input a positive number");
        }
    }
    public void printInfo()
    {
        System.out.println("This is the balance: $" + balance);
        System.out.println("Account owner: " + owner);
    }
    public void addInterest(double amount)
    {
        balance = balance + balance * amount;
    }
    public void taxes(double taxRate)
    {
        balance = balance - balance * taxRate;
    }
    
}
