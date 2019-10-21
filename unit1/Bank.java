public class Bank
{

//fields
private boolean isOpen;
private BankAccount account1;
private BankAccount account2;
private BankAccount account3;

//constructors

public Bank()
{   
    isOpen = true;
    account1 = new BankAccount("Radia Perlman", 1700.0 );
    account2 = new BankAccount();
    account3 = new BankAccount("Alan Turing", 1000.0);
}

//assumes three BankAccount already made
public Bank(BankAccount b1, BankAccount b2, BankAccount b3)
{
    isOpen = true;
    account1 = b1;
    account2 = b2;
    account3 = b3;
}

//must make objects
public Bank(double startingAmount)
{
    isOpen = true;
    account1 = new BankAccount("Radia Perlman", startingAmount);
    account2 = new BankAccount(startingAmount);
    account3 = new BankAccount("Alan Turing", startingAmount);
}

}// end of Bank class
