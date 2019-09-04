
/**
 * This class prints out a personalized greeting.
 * 
 * @author (Seth Frank)
 * @version (v1.0 7/4/19)
 */
public class Hello
{
    /*This is the main method which what you run to see results in the
     * BlueJ terminal window
     */
    public static void main(String[] args)
    {
        String name = "Seth";
        System.out.println("Hello " + name + " I am Java.");
        System.out.println("I might look scary at first but I am not really bad once you get to know me a bit.");
        
        //Assignment #2 Part 1
        //declaring a variable: declare a variable named sumOfAges meant to hold an integer (whole number)
        int sumOfAges;
        //assignment: assign a value to the memory location created for sumOfAges
        sumOfAges = 0;
        //using a variable: print the current value stored in sumOfAges
        System.out.println(sumOfAges);
        //declaring and assigning in one statement: declare a variable totalCost of the data type double and assign it 0.0
        double totalCost = 0.0;
        //practice independently
        int age1 = 10;
        int age2 = 18;
        int age3 = 22;
        int age4 = 45;
        
        sumOfAges = age1 + age2 + age3 + age4;
        System.out.println(sumOfAges);
        
        double costCandyBar = 3.99;
        double costSoda = 4.99;
        double costPopcorn = 5.99;
        double costTickets = 9.99;
        
        totalCost = costCandyBar + costSoda + costPopcorn + costTickets;
        System.out.println(totalCost);
        
        //Assignment #2 Part 2
        boolean isHungry = true;
        System.out.println(isHungry);
        
        if(isHungry == true)
        {
            System.out.println("You should have eaten breakfast.");
        }
        else
        {
            System.out.println("That's good.");
        }
        
        //Assignment 3A
        int age = 18;
        if(age >= 16)
        {
            System.out.println("You can drive.");
        }
        else
        {
            System.out.println("You are not old enough to drive.");
        }
        
        //Assignment 3B
        boolean isThristy = true;
        if(isThristy == true)
        {
            System.out.println("Drink water");
        }
        else
        {
            System.out.println("That's good");
        }
        
        //Assignment 3C
        int temperature = 90;
        int humidity = 70;
        if((temperature > 85)&&(humidity > 60))
        {
            System.out.println("Stay inside where it is cool!");
        }
        
        //Assignment 3D
        double height = 5.7;
        int weight = 115;
        if((height < 5.2)||(weight < 120))
        {
            System.out.println("I'm small");
        }
        
        //Assignment 3E
        boolean isHungry1 = true;
        boolean isSleepy = true;
        if((isHungry1 == true)&&(isSleepy == true))
        {
            System.out.println("Get some food and get some rest");
        }
        if((isHungry1 == true)&&(isSleepy == false))
        {
            System.out.println("Get some food");
        }
        if((isHungry1 == false)&&(isSleepy == true))
        {
            System.out.println("Get some rest");
        }
        if((isHungry1 == false)&&(isSleepy == false))
        {
            System.out.println("You are good");
        }
        
        //Assignment 4A
        int count = 0;
        while (count < 20)
        {
            count++;
            System.out.println("The count is " + count);
        }
        
        //Assignment 4B
        count = 21;
        while (count > 1)
        {
            count--;
            System.out.println("The count is " + count);
        }
        
        //Assignment 4C
        boolean isTrue = true;
        //while (isTrue)
        //{
            //System.out.println("Yeah");
        //}
        
        //Assignment 4D
        count = 21;
        while (count < 20)
        {
            count++;
            System.out.println("The count is " + count);
        }
        
        //Assignment 4E
        int num = 12;
        count = 3;
        int previous = 0;
        int next = 1;
        int sum;
        System.out.print("Fibonacci Sequence: ");
        
        System.out.print(previous + " " + next + " ");
        while(count <= num)
        { 
            sum = previous + next;
            System.out.print(sum + " ");
            previous = next;
            next = sum;
            count++;
        }
        
        //Assignment 5A
        for(int i = 0; i <= 20; i++)
        {
            System.out.println(i);
        }            
        
        //Assignment 5B
        for(int i = 20; i > 0; i--)
        {
            System.out.println(i);
        }
        
        //Assignment 5C
        for(int i = 1; i < 20; i = i + 3)
        {
            System.out.println(i);
        }
        
        //Assignment 5D
        for(int i = 28; i >= 4; i = i - 4)
        {
            System.out.println(i);
        }
        
        //Assignment 5E
        for(int i = 1; i <= 50; i++)
        {
            System.out.print(i);
            if(i % 2 == 0)
            {
                System.out.println(" Even");
            } else {
                System.out.println(" Odd");
            }
        }
        
        //Assignment 5F
        for(int i = 1; i <= 28; i = i + 7)
        {
            //System.out.println(i);
            for(int j = 0; j < 7; j++)
            {
                if(j + i < 10)
                {
                    System.out.print(j + i + " ");
                } else {
                    System.out.print(j + i);                    
                }
                System.out.print("  ");
            }
            System.out.println();
        }
        
    }
}