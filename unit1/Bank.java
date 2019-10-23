
public class Bank
{

    //fields
    private boolean isOpen;
    private BankAccount account1;
    private BankAccount account2;
    private BankAccount account3;
    
    private Employee president;
    private Employee vicePresident;
    private Employee teller1;
    private Employee teller2;
    private Employee teller3;
    
    //constructors
    
    public Bank()
    {   
        isOpen = true;
        account1 = new BankAccount("Radia Perlman", 1700.0 );
        account2 = new BankAccount();
        account3 = new BankAccount("Alan Turing", 1000.0);
        president = new Employee("Seth","Frank",16,"President", 100000, "00-100-1118");
        vicePresident = new Employee("Vivek","Voleti",16,"Vice President",10000, "00-001-0114");
        teller1 = new Employee("Bob","Bob",25,"Teller",10000,"10-421-5312");
        teller2 = new Employee("James","Bob",30,"Teller",10000,"10-421-5313");
        teller3 = new Employee("Dave","Bob",35,"Teller",10000,"10-421-5314");
    }
    
    //assumes three BankAccount already made
    public Bank(BankAccount b1, BankAccount b2, BankAccount b3, Employee e1, Employee e2, Employee e3, Employee e4, Employee e5)
    {
        isOpen = true;
        account1 = b1;
        account2 = b2;
        account3 = b3;
        president = e1;
        vicePresident = e2;
        teller1 = e3;
        teller2 = e4;
        teller3 = e5;
    }
    
    //must make objects
    public Bank(double startingAmount)
    {
        isOpen = true;
        account1 = new BankAccount("Radia Perlman", startingAmount);
        account2 = new BankAccount(startingAmount);
        account3 = new BankAccount("Alan Turing", startingAmount);
        president = new Employee("Seth","Frank",16,"President", startingAmount, "00-100-1118");
        vicePresident = new Employee("Vivek","Voleti",16,"Vice President",startingAmount, "00-001-0114");
        teller1 = new Employee("Bob","Bob",25,"Teller",startingAmount,"10-421-5312");
        teller2 = new Employee("James","Bob",30,"Teller",startingAmount,"10-421-5313");
        teller3 = new Employee("Dave","Bob",35,"Teller",startingAmount,"10-421-5314");
    }
    
    public Bank(String ownerName, double startingAmount, int age)
    {
        isOpen = true;
        account1 = new BankAccount(ownerName, startingAmount);
        account2 = new BankAccount(ownerName, startingAmount);
        account3 = new BankAccount(ownerName, startingAmount);
        president = new Employee("Seth","Frank",age,"President", 100000, "00-100-1118");
        vicePresident = new Employee("Vivek","Voleti",age,"Vice President",10000, "00-001-0114");
        teller1 = new Employee("Bob","Bob",age,"Teller",10000,"10-421-5312");
        teller2 = new Employee("James","Bob",age,"Teller",10000,"10-421-5313");
        teller3 = new Employee("Dave","Bob",age,"Teller",10000,"10-421-5314");
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
    
    public void fireBigShots()
    {
        president.fire();
        vicePresident.fire();
    }
    
    public void replaceBigShots()
    {
        president = teller1;
        vicePresident = teller2;
    }
    
    public void giveTellersRaise(double raise)
    {
        teller1.giveRaise(raise);
        teller2.giveRaise(raise);
        teller3.giveRaise(raise);
    }
    
    public void printCompanyReport()
    {
        president.printPersonnelReport();
        vicePresident.printPersonnelReport();
        teller1.printPersonnelReport();
        teller2.printPersonnelReport();
        teller3.printPersonnelReport();
        
        account1.printInfo();
        account2.printInfo();
        account3.printInfo();
    }
}// end of Bank class
