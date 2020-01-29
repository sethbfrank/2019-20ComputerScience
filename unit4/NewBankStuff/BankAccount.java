package NewBankStuff;

/**
 * A class to represent a simple BankAccount
 * 
 * @author (Tim Barron)
 * @version (1.0)
 */
public class BankAccount
{

//fields
    private double balance;
    private String owner;

    // constructors
    /**
     * Default Constructor for objects of class BankAccount
     */
    public BankAccount() {
        // initialise instance variables
        balance = 1.0;
        owner = "Tim Barron";
    }

    public BankAccount(final double start) {
        // initialise instance variables
        balance = start;
        owner = "Tim Barron";
    }

    public BankAccount(final String myOwner) {
        // initialise instance variables
        balance = 1.0;
        owner = myOwner;
    }

    public BankAccount(final String myOwner, final double start) {
        // initialise instance variables
        balance = start;
        owner = myOwner;
    }

    // methods
    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public void deposit(final double amount) {
        balance = balance + amount;
    }

    public void withdraw(final double amount)
    {
        balance = balance - amount;
    }
    
    public void printInfo()
    {
        System.out.println("This is the balance: $" + balance);
        System.out.println("Account owner: " + owner);
    }

}
