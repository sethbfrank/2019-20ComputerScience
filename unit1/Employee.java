
/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee
{
    //fields
    private String firstName;
    private String lastName;
    private int age;
    private String idNum;
    private String title;
    private double salary;

    //constructors
    public Employee()
    {
        // initialise instance variables
        firstName = "Seth";
        lastName = "Frank";
        age = 16;
        idNum = "1";
        title = "Secretary";
        salary = 200.00;
    }
    
    public Employee(String myFirstName, String myLastName, int myAge, String myTitle, double mySalary)
    {
        firstName = myFirstName;
        lastName = myLastName;
        age = myAge;
        title = myTitle;
        salary = mySalary;
        idNum = "00-000-0000";
    }

    //methods
    public String getFirstName()
    {
        return firstName;        
    }
    public String getLastName()
    {
        return lastName;
    }
    public int getAge()
    {
        return age;
    }
    public String getIDNum()
    {
        return idNum;
    }
    public String getTitle()
    {
        return title;
    }
    public double getSalary()
    {
        return salary;
    }
    
    public void setFirstName(String newFirstName)
    {
        firstName = newFirstName;
    }
    public void setLastName(String newLastName)
    {
        lastName = newLastName;
    }
    public void setIDNum(String newIDNum)
    {
        idNum = newIDNum;
    }
    
    public void increaseAge()
    {
        age++;
    }
    public void giveRaise(double amount)
    {
        salary = salary  + amount;
    }
    public void changePosition(String newTitle, double newSalary)
    {
        title = newTitle;
        salary = newSalary;
    }
    public void fire()
    {
        title = "Terminated";
        salary = 0;
    }
    public void printPersonnelReport()
    {
        System.out.println("This employee is " + firstName + " " + lastName + ".");
        System.out.println("They are " + age + " years old.");
        System.out.println("Their title is " + title + " and they have a salary of $" + salary);
        System.out.println("Their ID number is " + idNum);
    }
}
