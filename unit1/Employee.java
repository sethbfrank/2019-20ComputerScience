
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
        idNum = "00-000-0001";
        title = "Secretary";
        salary = 200.00;
    }
    
    public Employee(String myFirstName, String myLastName, int myAge, String myTitle, double mySalary, String myIDNum)
    {
        firstName = myFirstName;
        lastName = myLastName;
        age = myAge;
        title = myTitle;
        salary = mySalary;
        idNum = myIDNum;
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
    
    public String setFirstName(String newFirstName)
    {
        firstName = newFirstName;
        return firstName;
    }
    public String setLastName(String newLastName)
    {
        lastName = newLastName;
        return lastName;
    }
    public String setIDNum(String newIDNum)
    {
        /*if(length(idNumPart1) == 2)
        {
            System.out.println("Yeah");
        }*/
        idNum = newIDNum;
        return idNum;
    }
    
    public int increaseAge()
    {
        age++;
        return age;
    }
    public void giveRaise(double amount)
    {
        if(amount > 0)
        {
            salary = salary  + amount;
        }else{
            System.out.println("Please input a positive salary.");
        }
    }
    public void changePosition(String newTitle, double newSalary)
    {
        title = newTitle;
        if(newSalary > 0)
        {
            salary = newSalary;
        }else{
            System.out.println("Please input a positive salary.");
        }
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
