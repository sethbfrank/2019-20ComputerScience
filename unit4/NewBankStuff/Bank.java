package NewBankStuff;

public class Bank
{
    //fields
    private boolean isOpen;
    private BankAccount[] accounts;    
    private Employee[] employees;
    
    //private Employee[] employees = {Employee president, Employee vicePresident};

    //constructors
    public Bank()
    {
        isOpen = true;
        accounts = new BankAccount[3];
        accounts[0] = new BankAccount("Tim Barron", 300);
        accounts[1] = new BankAccount(700.0);
        accounts[2] = new BankAccount("joe bradley");

        employees = new Employee[5];
        employees[0] = new Employee();
        employees[1] = new Employee("Sandhya", "Sanapala", 21, "Vice President", 11000);
        employees[2] = new Employee("Sandy", "Cheeks", 10, "Teller #1", 20000);
        employees[3] = new Employee("Patrick", "Star", 35, "Teller #2", 50000);
        employees[4] = new Employee("Spongebob", "Squarepants", 12, "Teller #3", 100000);
    }

    public Bank(BankAccount[] b1, Employee[] e1)
    {
        isOpen = true;
        accounts = b1;
        employees = e1;
    }

    public Bank(double startingAmountForAllAccounts)
    {
        isOpen = true;
        accounts[0] = new BankAccount(startingAmountForAllAccounts);
        accounts[1] = new BankAccount(startingAmountForAllAccounts);
        accounts[2] = new BankAccount(startingAmountForAllAccounts);

        employees[0] = new Employee();
        employees[1] = new Employee("Sandhya", "Sanapala", 21, "Vice President", 11000);
        employees[2] = new Employee("Sandy", "Cheeks", 10, "Teller #1", 20000);
        employees[3] = new Employee("Patrick", "Star", 35, "Teller #2", 50000);
        employees[4] = new Employee("Spongebob", "Squarepants", 12, "Teller #3", 100000);
    }

    //methods
    public double calcTotalFunds ()
    {
        return accounts[0].getBalance() + accounts[1].getBalance() + accounts[2].getBalance();
    }
    
    public void chargeFees(double fee)
    {
        accounts[0].withdraw(fee);
        accounts[1].withdraw(fee);
        accounts[2].withdraw(fee);
    }
    
    public void addInterest()
    {
        accounts[0].deposit(accounts[0].getBalance() * 0.05);
        accounts[1].deposit(accounts[1].getBalance() * 0.05);
        accounts[2].deposit(accounts[2].getBalance() * 0.05);        
    }
    
    public void printAllReports()
    {
        accounts[0].printInfo();
        accounts[1].printInfo();
        accounts[2].printInfo();
    }

    public void fireBigShots()
    {
        employees[0].fire();
        employees[1].fire();
    }

    public void replaceBigShots(Employee emp1, Employee emp2)
    {
        employees[0] = emp1;
        employees[1] = emp2;
    }

    public void giveTellersRaise(double raise)
    {
        employees[2].giveRaise(raise);
        employees[3].giveRaise(raise);
        employees[4].giveRaise(raise);
    }

    public void printCompanyReport()
    {
        printAllReports();
        employees[0].printPersonnelReport();
        employees[1].printPersonnelReport();
        employees[2].printPersonnelReport();
        employees[3].printPersonnelReport();
        employees[4].printPersonnelReport();
    }


}