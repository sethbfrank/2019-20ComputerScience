
/**
 * Write a description of class MultiTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankTester
{
    public static void main (String[] args)
    {
        Bank b1 = new Bank();
        System.out.println(b1);
        Bank b2 = new Bank(new BankAccount("Radia Perlman", 1700.0 ), new BankAccount(), new BankAccount("Alan Turing", 1000.0), new Employee("Seth","Frank",16,"President", 100000, "00-100-1118"),new Employee("Vivek","Voleti",16,"Vice President",10000, "00-001-0114"),new Employee("Bob","Bob",25,"Teller",10000,"10-421-5312"),new Employee("James","Bob",30,"Teller",10000,"10-421-5313"),new Employee("Dave","Bob",35,"Teller",10000,"10-421-5314"));
        System.out.println(b2);
        Bank b3 = new Bank(100.00);
        System.out.println(b3);
        Bank b4 = new Bank("Seth Frank", 100.00, 30);
        System.out.println(b4);
        
        System.out.println(b1.calcTotalFunds());
        b1.chargeFees(100.0);
        b1.printAllReports();
        b1.addInterest();
        b1.printAllReports();
        
        b1.fireBigShots();
        b1.printCompanyReport();
        b1.replaceBigShots();
        b1.printCompanyReport();
        b1.giveTellersRaise(100);
        b1.printCompanyReport();
        
        System.out.println(b2.calcTotalFunds());
        b2.chargeFees(100.0);
        b2.printAllReports();
        b2.addInterest();
        b2.printAllReports();
        
        b2.fireBigShots();
        b2.printCompanyReport();
        b2.replaceBigShots();
        b2.printCompanyReport();
        b2.giveTellersRaise(100);
        b2.printCompanyReport();
        
        System.out.println(b3.calcTotalFunds());
        b3.chargeFees(100.0);
        b3.printAllReports();
        b3.addInterest();
        b3.printAllReports();
        
        b3.fireBigShots();
        b3.printCompanyReport();
        b3.replaceBigShots();
        b3.printCompanyReport();
        b3.giveTellersRaise(100);
        b3.printCompanyReport();
        
        System.out.println(b4.calcTotalFunds());
        b4.chargeFees(100.0);
        b4.printAllReports();
        b4.addInterest();
        b4.printAllReports();        
        
        b4.fireBigShots();
        b4.printCompanyReport();
        b4.replaceBigShots();
        b4.printCompanyReport();
        b4.giveTellersRaise(100);
        b4.printCompanyReport();
    }
}