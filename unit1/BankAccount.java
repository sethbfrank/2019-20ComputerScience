
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
    public BankAccount(String owner, double balance)
    {
        //this is referring to the field of the object
        this.balance = balance;
        this.owner = owner;
    }
    public BankAccount(String owner)
    {
        balance = 1.0;
        this.owner = owner;
    }
    public BankAccount(double balance)
    {
        this.balance = balance;
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
        System.out.println("");
    }
    public void addInterest(double amount)
    {
        balance = balance + balance * amount;
    }
    public void taxes(double taxRate)
    {
        balance = balance - balance * taxRate;
    }
    public void transferTo(BankAccount other, double amount)
    {
        this.withdraw(amount);
        other.deposit(amount);
        this.printInfo();
        other.printInfo();
    }
    
}
