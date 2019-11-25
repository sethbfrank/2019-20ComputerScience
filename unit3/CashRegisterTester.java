public class CashRegisterTester
{
    public static void main(String[] args)
    {
        CashRegister r1 = new CashRegister();
        r1.printRegisterStatus();
        //r1.addMoney(0, 0, 5, 0, 5, 0, 0, 10);
        r1.removeOptimumMoneyPossible(70.25);
        r1.printRegisterStatus();

        //CashRegister r2 = new CashRegister(5);
        //r2.printRegisterStatus();
    }
}