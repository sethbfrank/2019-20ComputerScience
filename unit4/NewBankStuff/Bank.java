package NewBankStuff;

public class Bank
{
    //fields
    private boolean isOpen;
    public BankAccount[] accounts;    
    public Employee[] employees;
    
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

    public Bank(BankAccount[] accounts, Employee[] employees)
    {
        isOpen = true;
        this.accounts = accounts;
        this.employees = employees;
    }

    public Bank(double startingAmountForAllAccounts)
    {
        isOpen = true;
        
        accounts = new BankAccount[3];
        accounts[0] = new BankAccount(startingAmountForAllAccounts);
        accounts[1] = new BankAccount(startingAmountForAllAccounts);
        accounts[2] = new BankAccount(startingAmountForAllAccounts);

        employees = new Employee[5];
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
        for(BankAccount account: accounts)
        {
            account.withdraw(fee);
        }
    }
    
    public void addInterest()
    {
        for(BankAccount account : accounts)
        {
            account.deposit(account.getBalance() * 0.05);
        }
    }
    
    public void printAllReports()
    {
        for(BankAccount account : accounts)
        {
            account.printInfo();
        }
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
        for(int i = 2; i <= 4; i++)
        {
            employees[i].giveRaise(raise);
        }
    }

    public void printCompanyReport()
    {
        printAllReports();
        for(Employee employee : employees)
        {
            employee.printPersonnelReport();
        }
    }


}