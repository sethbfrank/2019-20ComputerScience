import java.util.Scanner;

public class PigLatin
{
   public static void main(String[] args)
   {
     Scanner someScanner = new Scanner(System.in); 

     System.out.print("Enter word: ");
     String word = someScanner.next();
     someScanner.nextLine();

     // Use word.substring to construct word in pig latin
     word.length();
     String lastLetter = word.substring(word.length()-1);
     String otherPart = word.substring(0, word.length() -1);
     String pigLatin = lastLetter + otherPart + "ay"; 

     System.out.println(word + " in Pig Latin is " + pigLatin);
   }
}