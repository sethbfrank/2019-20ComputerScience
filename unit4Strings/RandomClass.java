public class RandomClass
{
    public static void main(String[] args) 
    {
        int[] numbers = new int[2];
        System.out.println(numbers[0]);
        for(int i = 0; i < numbers.length; i++)
        {
            numbers[i]++;
            System.out.println(numbers[i]);
        }

    }        
}