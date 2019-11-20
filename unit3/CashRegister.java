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


    //methods
    public void printRegisterStatus()
    {
        System.out.println(currentID);
        System.out.println("Twenties: " + twenties);
        System.out.println("Tens: " + tens);
        System.out.println("Fives: " + fives);
        System.out.println("Ones: " + ones);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);
    }
    
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
}