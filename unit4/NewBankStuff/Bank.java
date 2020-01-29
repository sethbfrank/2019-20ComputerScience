package NewBankStuff;

public class Bank
{
    //fields
    private boolean isOpen;
    private BankAccount account1;
    private BankAccount account2;
    private BankAccount account3;
    
    Employee[] employees = new Employee[5];
    
    //private Employee[] employees = {Employee president, Employee vicePresident};

    //constructors
    public Bank()
    {
        isOpen = true;
        account1 = new BankAccount("Tim Barron", 300);
        account2 = new BankAccount(700.0);
        account3 = new BankAccount("joe bradley");

        employees[0] = new Employee();
        employees[1] = new Employee("Sandhya", "Sanapala", 21, "Vice President", 11000);
        employees[2] = new Employee("Sandy", "Cheeks", 10, "Teller #1", 20000);
        employees[3] = new Employee("Patrick", "Star", 35, "Teller #2", 50000);
        employees[4] = new Employee("Spongebob", "Squarepants", 12, "Teller #3", 100000);
    }

    public Bank(BankAccount b1, BankAccount b2, BankAccount b3, Employee[] e1)
    {
        isOpen = true;
        account1 = b1;
        account2 = b2;
        account3 = b3;
        employees = e1;
    }

}