public class DistanceFormula
{
    public static void distance(int x1, int y1, int x2, int y2)
    {
        double x = Math.pow((x2 - x1),2);
        double y = Math.pow((y2 - y1),2);
        double d = Math.sqrt(x + y);
        System.out.println(d);
    }
}