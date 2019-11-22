public class CashRegister
{

    //fields
    private int pennies;
    private int nickels;
    private int dimes;
    private int quarters;
    private int ones;
    private int fives;
    private int tens;
    private int twenties;
    private int currentID;
    private static int id = 0;


    //constructors
    public CashRegister()
    {
        this.replenish();
        currentID = id;
        id++;
    }
    public CashRegister(int pennies, int nickels, int dimes, int quarters, int ones, int fives, int tens, int twenties)
    {
        this.pennies = pennies;
        this.nickels = nickels;
        this.dimes = dimes;
        this.quarters = quarters;
        this.ones = ones;
        this.fives = fives;
        this.tens = tens;
        this.twenties = twenties;
        currentID = id;
        id++;
    }
    public CashRegister(int pennies)
    {
        this.pennies = pennies;
        nickels = CashRegister.randomInt(5, 20);
        dimes = CashRegister.randomInt(5, 20);
        quarters = CashRegister.randomInt(10, 24);
        ones = CashRegister.randomInt(10, 45);
        fives = CashRegister.randomInt(1,15);
        tens = CashRegister.randomInt(1, 12);
        twenties = CashRegister.randomInt(1, 5);
        currentID = id;
        id++;
    }



    //methods

    /*public static int getTwenties()
    {
        return twenties;
    }*/


    //private method to determine a random int based on a range
    private static int randomInt(int min, int max)
    {
        int randomNum = (int)(Math.random()*(max - min + 1)) + min;
        return randomNum;
    }
    
    //prints our infomration from the cash register
    public void printRegisterStatus()
    {
        System.out.println("");
        System.out.println("ID Number: " + currentID);
        System.out.println("Twenties: " + twenties);
        System.out.println("Tens: " + tens);
        System.out.println("Fives: " + fives);
        System.out.println("Ones: " + ones);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);
        System.out.println("******************");
    }
    
    //replenishes a cash register with default information
    public void replenish()
    {
        twenties = 5;
        tens = 12;
        fives = 15;
        ones = 45;
        quarters = 24;
        dimes = 20;
        nickels = 20;
        pennies = 100;
    }
    
    //calculates the total amount of money in the cash register and returns it as a double
    public double calculateTotalMoney()
    {
        double totalMoney;
        totalMoney = twenties*20;
        totalMoney += tens*10;
        totalMoney += fives*5;
        totalMoney += ones;
        totalMoney += quarters*.25;
        totalMoney += dimes*.1;
        totalMoney += nickels*.05;
        totalMoney += pennies*.01;
        return totalMoney;
    }

    //adds a specific amoutn of coins or bills to a cash register based on user inputs
    public void addMoney(int pennies, int nickels, int dimes, int quarters, int ones, int fives, int tens, int twenties)
    {
        this.pennies+=pennies;
        this.nickels+=nickels;
        this.dimes+=dimes;
        this.quarters+=quarters;
        this.ones+=ones;
        this.fives+=fives;
        this.tens+=tens;
        this.twenties+=twenties;
    }

    public void moneyOptimizer(double value, int type)
    {
        int dollars = (int) value;
        System.out.println(dollars);
        
        if((dollars/20) > twenties)
        {
            //if there are less twenties in the cash register
            System.out.println("Twenties: " + twenties);
            dollars-=(twenties*20);
        }else{
            //if there are an abudance of twenties in the cash register
            System.out.println("Twenties: " + dollars/20);
            dollars = dollars%20;
        }
        System.out.print("Remaining: " + dollars);
        
        if((dollars/10) > tens)
        {
            System.out.println("Tens: " + tens);
            dollars-=(tens*10);
        }else{
            System.out.println("Tens: " + dollars/10);
        }
    }

    public void removeOptimumMoneyPossible(double amount)
    {
        if(amount > this.calculateTotalMoney())
        {
            System.out.println("Not enough in Cash Register");
        }else{
            int dollars = (int) amount;
            System.out.println(dollars);
            
            if((dollars/20) > twenties)
            {
                System.out.println("Twenties: " + twenties);
                dollars-=(twenties*20);
            }else{
                System.out.println("Twenties: " + dollars/20);
                dollars = dollars%20;
            }
            System.out.print(dollars);
        }
    }
}