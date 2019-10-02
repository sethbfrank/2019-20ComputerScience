public class PartnerEmployee
{
    private String firstName;
    private String lastName;
    private int age;
    private int idNum;
    private String title;
    private double salary;
    
    public PartnerEmployee()
    {
        firstName = " ";
        lastName = " ";
        age = 16;
        idNum = 0;
        title = " ";
        salary = 0;
    }
    public PartnerEmployee(String fName, String lName, int old, String call, double make)
    {
        firstName = fName;
        lastName = lName;
        age = old;
        title = call;
        salary = make;
    }
    public String firstName()
    {
        return firstName;
    }
    public String lastName()
    {
        return lastName;
    }
    public int age()
    {
        return age;
    }
    public String title()
    {
        return title;
    }
    public double salary()
    {
        return salary;
    }
    public int increaseAge()
    {   age = age + 1;
        return age;
    }
    public double giveRaise(double howMuch)
    {
        salary = salary + howMuch;
        return salary;
    }
    public void changePosition(String newTitle, double newSalary)
    {
        title = newTitle;
        salary = newSalary;
    }
    public void fire()
    {
        title = "terminated";
        salary = 0;
    }
    public int setId(int employeeNumber)
    {
        idNum = employeeNumber;
        return idNum;
    }
    public void printPersonnelReport()
    {
        System.out.println("Name: " + lastName + ", " + firstName);
        System.out.println("Age: " + age);
        System.out.println("ID Number: " + idNum);
        System.out.println("Current Title: " + title);
        System.out.println("Salary: " + salary);
    }
}


