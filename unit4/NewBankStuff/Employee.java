package NewBankStuff;

public class Employee
{   //start of class

//fields

    private String firstName;
    private String lastName;
    private int age;
    private String idNum;
    private String title;
    private double salary;

    // constructors

    public Employee() {
        // initialise fields ( instance variables)
        firstName = "Luis";
        lastName = "von Ahn";
        age = 35;
        idNum = "00-000-0000";
        title = "Computer Science Professor";
        salary = 120000;
    }

    public Employee(final String first, final String last, final int myAge, final String occupation, final double start) {
        firstName = first;
        lastName = last;
        age = myAge;
        idNum = "00-000-0000";
        title = occupation;
        salary = start;
    }

    // methods These are accessors and these are mutators.

    public String getFirst() {
        return firstName;
    }

    public String getLast() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getTitle() {
        return title;
    }

    public double getSalary() {
        return salary;
    }

    public void setID(final String assignedID) {
        idNum = assignedID;
    }

    public String getID() {
        return idNum;
    }

    public void giveRaise(final double increase) {
        salary = salary + increase;
    }

    public void increaseAge() {
        age = age + 1;
    }

    public void changePosition(final String newPosition, final double newSalary)
    {
            title = newPosition;
            salary = newSalary;
    }

public void fire()
    {
            title = "terminated";
            salary = 0;
    }

public void printPersonnelReport()
    {
        System.out.println("firstName: " + firstName);
        System.out.println("lastName: " + lastName);
        System.out.println("age: " + age);
        System.out.println("idNum: " + idNum);
        System.out.println("title: " + title);
        System.out.println("salary: $" + salary);
    }

}  //end of class
