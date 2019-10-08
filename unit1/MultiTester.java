
/**
 * Write a description of class MultiTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MultiTester
{
    public static void main (String[] args)
    {
        BankAccount b1 = null;
        System.out.println(b1);
        b1 = new BankAccount();
        System.out.println(b1);
        
        BankAccount b2 = new BankAccount("Seth Frank",100.0);
        BankAccount b3 = new BankAccount("Seth Frank");
        
        b1.printInfo();
        b1.deposit(100);
        b1.printInfo();
        b1.withdraw(100);
        b1.printInfo();
        
        b2.printInfo();
        b2.deposit(100);
        b2.printInfo();
        b2.withdraw(100);
        b2.printInfo();
        
        b3.printInfo();
        b3.deposit(100);
        b3.printInfo();
        b3.withdraw(100);
        b3.printInfo();
        
        Employee e1 = new Employee();
        
        //Accessor methods
        e1.getFirstName();
        e1.getLastName();
        e1.getAge();
        e1.getIDNum();
        e1.getTitle();
        e1.getSalary();
        e1.printPersonnelReport();
        
        //Mutators
        e1.setFirstName("Tim");
        e1.setLastName("Barron");
        e1.increaseAge();
        e1.printPersonnelReport();
        
        e1.setIDNum(54,798,46);
        e1.giveRaise(1000);
        e1.printPersonnelReport();
        
        e1.changePosition("Computer Science Teacher", 5000);
        e1.printPersonnelReport();        
        
        e1.fire();
        e1.printPersonnelReport();
    }
}
