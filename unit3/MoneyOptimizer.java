public class MoneyOptimizer
{
    public static void main(String[] args)
    {
        MoneyOptimizer.moneyOptimizer(47.63);
    }
    
    public static void moneyOptimizer(double value)
    {
        int dollars = (int) value;
        System.out.println(dollars);
        
        System.out.println("Twenties: " + dollars/20);
        dollars = dollars%20;
        System.out.println(dollars);
    
        System.out.println("Tens: " + dollars/10);
        dollars = dollars%10;
        System.out.println(dollars);
    
        System.out.println("Fives: " + dollars/5);
        dollars = dollars%5;
        System.out.println(dollars);
    
        System.out.println("Ones: " + dollars/1);

        //changes cents to an integer number
        double cents = value%(int)value;
        cents = cents*100;
        int centInt = (int) cents;
        System.out.println(centInt);

        System.out.println("Quaters: " + centInt/25);
        centInt = centInt%25;
        System.out.println(centInt);

        System.out.println("Dimes: " + centInt/10);
        centInt = centInt%10;
        System.out.println(centInt);

        System.out.println("Nickels: " + centInt/5);
        centInt = centInt%5;
        System.out.println(centInt);

        System.out.println("Pennies: " + centInt/1);
        centInt = centInt%1;
        System.out.println(centInt);
            

    }
}