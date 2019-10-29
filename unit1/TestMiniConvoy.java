public class TestMiniConvoy
{
    public static void main(String[] args)
    {
        MiniConvoy mc1 = new MiniConvoy();
        Car mc2lead = ("Hyundai", "Tucson", "Gray", 10000);
        Car mc2middle = ("Honda", "Pilot", "Marroon", 120000);
        Car mc2end = ("Porshe", "911", "Black", 1000);
        MiniConvoy mc2 = new MiniConvoy("Farmington", mc2lead, mc2middle, mc2end);

        mc1.printConvoyInfo();
        mc2.printConvoyInfo();

        mc1.travel(500);
        mc2.setDestination("Boston");
        mc1.swapOrder();
        
        mc1.printConvoyInfo();
        mc2.printConvoyInfo();

        Car c = new Car("Ford", "Raptor", "Blue", 50000);

        mc1.replaceCar(c, 2);

        mc1.printConvoyInfo();
        mc2.printConvoyInfo();
    }
}