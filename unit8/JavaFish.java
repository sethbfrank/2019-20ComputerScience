
public class JavaFish
{
    // instance variables
    private int age;
    private String color;
 
    //constructors
    public JavaFish()
    {
        age = 1;
        color = "gray";
    }

    public JavaFish(String color)
    {
        age = 1;
        this.color = color;
    }
    
    //methods
    public void swim()
    {
        System.out.println("The " + color + " fish which is " + age + " years old is swimming....");
    }

    public String getColor()
    {
        return color;
    }   

    public void setColor(String c)
    {
        color = c;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int a)
    {
        age = a;
    }
}
