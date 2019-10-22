
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

public Bank(String ownerName, double startingAmount)
{
    isOpen = true;
    account1 = new BankAccount(ownerName, startingAmount);
    account2 = new BankAccount(ownerName, startingAmount);
    account3 = new BankAccount(ownerName, startingAmount);
}

//methods
public double calcTotalFunds()
{
    return account1.getBalance() + account2.getBalance() + account3.getBalance();
}

public void chargeFees(double feeAmount)
{
    account1.withdraw(feeAmount);
    account2.withdraw(feeAmount);
    account3.withdraw(feeAmount);
}

public void addInterest()
{
    account1.addInterest(.05);
    account2.addInterest(.05);
    account3.addInterest(.05);
}

public void printAllReports()
{
    account1.printInfo();
    account2.printInfo();
    account3.printInfo();
}

}// end of Bank class
