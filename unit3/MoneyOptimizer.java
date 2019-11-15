public class MoneyOptimizer
{
    public static void main(String[] args)
    {
        MoneyOptimizer.moneyOptimizer(47.63);
        MoneyOptimizer.moneyOptimizer(102.57);
        MoneyOptimizer.moneyOptimizer(8.64);
        MoneyOptimizer.moneyOptimizer(0.91);
        MoneyOptimizer.moneyOptimizer(300.47);
    }
    
    public static void moneyOptimizer(double value)
    {
        System.out.println(value);
        int dollars = (int) value;
        //System.out.println(dollars);
        
        System.out.println("Twenties: " + dollars/20);
        dollars = dollars%20;
    
        System.out.println("Tens: " + dollars/10);
        dollars = dollars%10;
    
        System.out.println("Fives: " + dollars/5);
        dollars = dollars%5;
    
        System.out.println("Ones: " + dollars/1);

        //changes cents to an integer number
        double cents;
        if(value < 1)
        {
            cents = value;
            cents = cents*100;
        }else{
            cents = value%(int)value;
            cents += .001;
            cents = cents*100;
        }
        
        int centInt = (int) cents;
        //System.out.println(centInt);

        System.out.println("Quaters: " + centInt/25);
        centInt = centInt%25;

        System.out.println("Dimes: " + centInt/10);
        centInt = centInt%10;

        System.out.println("Nickels: " + centInt/5);
        centInt = centInt%5;

        System.out.println("Pennies: " + centInt/1);
        centInt = centInt%1;           

    }
}