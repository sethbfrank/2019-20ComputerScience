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

    //static field used to keep track of the amount of money in removeOptimumMoneyPossible
    private static int moneyInt;


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
        System.out.println("Total Money : $" + this.calculateTotalMoney());
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

    //adds a specific amount of coins or bills to a cash register based on user inputs
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

    //removes a certain amount of money based on the amount inputed
    public void removeOptimumMoneyPossible(double amount)
    {
        if(amount > this.calculateTotalMoney())
        {
            System.out.println("Not enough in Cash Register");
        }else{
            moneyInt = (int) amount;
            System.out.println("Amount of Money Given to You");
            moneyOptimizer(amount, "Twenties");
            moneyOptimizer(amount, "Tens");
            moneyOptimizer(amount, "Fives");
            moneyOptimizer(amount, "Ones");
            
            //changes cents to an integer number
            double cents;
            if(amount < 1)
            {
                cents = amount;
                cents = cents*100;
            }else{
                cents = amount%(int)amount;
                cents += .001;
                cents = cents*100;
            }            
            moneyInt = (int) cents;

            moneyOptimizer(amount, "Quarters");
            moneyOptimizer(amount, "Dimes");
            moneyOptimizer(amount, "Nickels");
            moneyOptimizer(amount, "Pennies");
        }
    }

    //checks to see what field type is being used (twenties, tens, etc.)
    public void moneyOptimizer(double amount, String type)
    {
        int intType;
        int tempField;
        if(type == "Twenties")
        {
            intType = 20;
            tempField = twenties;
            twenties = this.reusable(type, intType, tempField);
        }
        else if(type == "Tens")
        {
            intType = 10;
            tempField = tens;
            tens = this.reusable(type, intType, tempField);
        }
        else if(type == "Fives")
        {
            intType = 5;
            tempField = fives;
            fives = this.reusable(type, intType, tempField);
        }
        else if(type == "Ones")
        {
            intType = 1;
            tempField = ones;
            ones = this.reusable(type, intType, tempField);
        }
        else if(type == "Quarters")
        {
            intType = 25;
            tempField = quarters;
            quarters = this.reusable(type, intType, tempField);
        }
        else if(type == "Dimes")
        {
            intType = 10;
            tempField = dimes;
            dimes = this.reusable(type, intType, tempField);
        }
        else if(type == "Nickels")
        {
            intType = 5;
            tempField = nickels;
            nickels = this.reusable(type, intType, tempField);
        }
        else if(type == "Pennies")
        {
            intType = 1;
            tempField = pennies;
            pennies = this.reusable(type, intType, tempField);
        }
    }
    //a reusable method that can be used with any money field type (twenties, quarters, etc.)  
    public int reusable(String type, int intType, int tempField)
    { 
        if((moneyInt/intType) > tempField)
        {
            //if there are less twenties in the cash register
            System.out.println(type + ": " + tempField);
            moneyInt-=(tempField*intType);
            tempField = 0;
        }else{
            //if there are an abudance of twenties in the cash register
            System.out.println(type + ": " + moneyInt/intType);
            tempField-=(moneyInt/intType);
            moneyInt = moneyInt%intType;
        }
        return tempField;
    }





    //another method removeOptimumMoneyPossible that is not as resuable
    //not used in the program, but I keep it for my own reference
    public void removeOptimumMoneyPossible2(double amount)
    {
        if(amount > this.calculateTotalMoney())
        {
            System.out.println("Not enough in Cash Register");
        }else{
            int dollars = (int) amount;

            if((dollars/20) > twenties)
            {
                //if there are less twenties in the cash register
                System.out.println("Twenties: " + twenties);
                dollars-=(twenties*20);
                twenties = 0;
            }else{
                //if there are an abudance of twenties in the cash register
                System.out.println("Twenties: " + dollars/20);
                twenties-=(dollars/20);
                dollars = dollars%20;
            }
            
            if((dollars/10) > tens)
            {
                System.out.println("Tens: " + tens);
                dollars-=(tens*10);
                tens = 0;
            }else{
                System.out.println("Tens: " + dollars/10);
                tens-=dollars/10;
                dollars = dollars%10;
            }

            if((dollars/5) > fives)
            {
                System.out.println("Fives: " + fives);
                dollars-=(fives*5);
                fives = 0;
            }else{
                System.out.println("Fives: " + dollars/5);
                fives-=dollars/5;
                dollars = dollars%5;
            }

            if((dollars/1) > ones)
            {
                System.out.println("Ones: " + ones);
                dollars-=(ones*1);
                ones = 0;
            }else{
                System.out.println("Ones: " + dollars/1);
                ones-=dollars/1;
                dollars = dollars%1;
            }

            //changes cents to an integer number
            double cents;
            if(amount < 1)
            {
                cents = amount;
                cents = cents*100;
            }else{
                cents = amount%(int)amount;
                cents += .001;
                cents = cents*100;
            }
            
            int centInt = (int) cents;

            if((centInt/25) > quarters)
            {
                System.out.println("Quarters: " + quarters);
                centInt-=(quarters*25);
                quarters = 0;
            }else{
                System.out.println("Quarters: " + centInt/25);
                quarters-=centInt/25;
                centInt = centInt%25;
            }

            if((centInt/10) > dimes)
            {
                System.out.println("Dimes: " + dimes);
                centInt-=(dimes*10);
                dimes = 0;
            }else{
                System.out.println("Dimes: " + centInt/10);
                dimes-=centInt/10;
                centInt = centInt%10;
            }

            if((centInt/5) > nickels)
            {
                System.out.println("Nickels: " + nickels);
                centInt-=(nickels*5);
                nickels = 0;
            }else{
                System.out.println("Nickels: " + centInt/5);
                nickels-=centInt/5;
                centInt = centInt%5;                
            }

            if((centInt/1) > pennies)
            {
                System.out.println("Pennies: " + pennies);
                centInt-=(pennies*1);
                pennies = 0;
            }else{
                System.out.println("Pennies: " + centInt/1);
                pennies-=centInt/1;
                centInt = centInt%1;                
            }
        }
    }
}