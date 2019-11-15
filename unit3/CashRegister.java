public class CashRegister
{
    private int pennies;
    private int nickels;
    private int dimes;
    private int quarters;
    private int ones;
    private int fives;
    private int tens;
    private int twenties;
    private int idNum;
    private static int nextID;

    public CashRegister()
    {

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