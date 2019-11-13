public class RecreatingMath
{    
    public static void main(String[] args)
    {
        for(int n = 1; n <= 126; n+=5)
        {
            System.out.print(n);
            System.out.print("  ");
            System.out.print((int)Math.pow(n,2));
            System.out.print("  ");
            
            if((Math.sqrt(n)%1) == 0)
            {
                System.out.print((int)Math.sqrt(n));
            }else{
                System.out.print(Math.sqrt(n));
            }
            
            System.out.print("  ");
            System.out.print((int)Math.pow(n,3));
            System.out.print("  ");

            if((Math.cbrt(n)%1) == 0)
            {
                System.out.println((int)Math.cbrt(n));
            }else{
                System.out.println(Math.cbrt(n));
            }
        }
        DistanceFormula.distance(2, 0, 1, 0);
        DistanceFormula.distance(7, 4, 11, 15);
    }
}