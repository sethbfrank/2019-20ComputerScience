public class StringReview
{
    public static void main(String args[])
    {
        String s1 = "review";

        System.out.println(s1.length());
        String s2 = s1.substring(0,3);
        System.out.println(s2);
        s2 = s1.substring(2);
        System.out.println(s2);
        System.out.println(s1.indexOf("e"));

        String s4 = "Review";
        System.out.println(s1.compareTo(s4));
        System.out.println(s4.compareTo(s1));

    }

    public static void printEverySingleLetter(String word)
    {
        for(int i = 0; i <= word.length(); i++)
        {
            System.out.println(word.substring(i,i+1));
        }
    }

}