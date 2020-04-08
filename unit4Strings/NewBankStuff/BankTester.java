package NewBankStuff;

public class BankTester
{
    public static void main(String[] args) 
    {
        System.out.println("********");
        Bank b1 = new Bank();
        System.out.println(b1);
        
        Bank b2 = new Bank(new BankAccount[3], new Employee[5]);
        b2.accounts[0] = new BankAccount("Tim Barron", 300);
        b2.accounts[1] = new BankAccount(700.0);
        b2.accounts[2] = new BankAccount("joe bradley");
        b2.employees[0] = new Employee();
        b2.employees[1] = new Employee("Sandhya", "Sanapala", 21, "Vice President", 11000);
        b2.employees[2] = new Employee("Sandy", "Cheeks", 10, "Teller #1", 20000);
        b2.employees[3] = new Employee("Patrick", "Star", 35, "Teller #2", 50000);
        b2.employees[4] = new Employee("Spongebob", "Squarepants", 12, "Teller #3", 100000);
        System.out.println(b2);
        
        Bank b3 = new Bank(100.00);
        System.out.println(b3);

        System.out.println(b1.calcTotalFunds());
        b1.chargeFees(100.0);
        b1.printAllReports();
        b1.addInterest();
        b1.printAllReports();
        
        b1.fireBigShots();
        b1.printCompanyReport();
        b1.replaceBigShots(new Employee("George","Bob",30,"President",100000), new Employee("Michael","Bob",30,"Vice President",10000));
        b1.printCompanyReport();
        b1.giveTellersRaise(100);
        b1.printCompanyReport();
        System.out.println("**************");   

        System.out.println(b2.calcTotalFunds());
        b2.chargeFees(100.0);
        b2.printAllReports();
        b2.addInterest();
        b2.printAllReports();
        
        b2.fireBigShots();
        b2.printCompanyReport();
        b2.replaceBigShots(new Employee("George","Bob",30,"President",100000), new Employee("Michael","Bob",30,"Vice President",10000));
        b2.printCompanyReport();
        b2.giveTellersRaise(100);
        b2.printCompanyReport();
        System.out.println("**************");

        System.out.println(b3.calcTotalFunds());
        b3.chargeFees(100.0);
        b3.printAllReports();
        b3.addInterest();
        b3.printAllReports();
        
        b3.fireBigShots();
        b3.printCompanyReport();
        b3.replaceBigShots(new Employee("George","Bob",30,"President",100000), new Employee("Michael","Bob",30,"Vice President",10000));
        b3.printCompanyReport();
        b3.giveTellersRaise(100);
        b3.printCompanyReport();
        System.out.println("**************");
    }
}