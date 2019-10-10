
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
        System.out.println(e1.getFirstName());
        System.out.println(e1.getLastName());
        System.out.println(e1.getAge());
        System.out.println(e1.getIDNum());
        System.out.println(e1.getTitle());
        System.out.println(e1.getSalary());
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

        Employee e2 = new Employee("Seth","Frank", 20, "Teacher", 100.0, "05-934-7854");

        System.out.println(e2.getFirstName());
        System.out.println(e2.getLastName());
        System.out.println(e2.getAge());
        System.out.println(e2.getIDNum());
        System.out.println(e2.getTitle());
        System.out.println(e2.getSalary());
        e2.printPersonnelReport();

        e2.setFirstName("Tim");
        e2.setLastName("Barron");
        e2.increaseAge();
        e2.printPersonnelReport();
        
        e2.setIDNum(54,798,46);
        e2.giveRaise(1000);
        e2.printPersonnelReport();
        
        e2.changePosition("Computer Science Teacher", 5000);
        e2.printPersonnelReport();        
        
        e2.fire();
        e2.printPersonnelReport();
    }
}
