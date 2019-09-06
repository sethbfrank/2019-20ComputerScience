import java.util.Scanner;

public class TruthTables
{
    public static void main()
    {
    //add code in here
    Scanner someScanner = new Scanner(System.in);
    boolean valid = false;
    
    System.out.print("Do you have pets? ");
    boolean hasPets = someScanner.nextBoolean();
    someScanner.nextLine();
    
    if(hasPets)
    {
        System.out.print("How many pets do you have? ");
        int numPets = someScanner.nextInt();
        someScanner.nextLine();
        
        if(numPets <= 3)
        {
            System.out.print("Do you have a noisy bird? ");
            boolean noisyBird = someScanner.nextBoolean();
            someScanner.nextLine();
            
            if(noisyBird == false)
            {
                System.out.print("Do you have a pet other than a dog, cat, or bird? ");
                boolean otherPets = someScanner.nextBoolean();
                someScanner.nextLine();
                
                if(otherPets == false)
                {
                    System.out.print("Do you have a dog? ");
                    boolean hasDog = someScanner.nextBoolean();
                    someScanner.nextLine();
                    //System.out.println(hasDog);
                    
                    System.out.print("Do you have a cat? ");
                    boolean hasCat = someScanner.nextBoolean();
                    someScanner.nextLine();
                    //System.out.println(hasCat);
                    
                    System.out.print("Do you have a bird? ");
                    boolean hasBird = someScanner.nextBoolean();
                    someScanner.nextLine();
                    //System.out.println(hasBird);
                    
                    if(hasDog == true && hasCat == true && hasBird == false)
                    {
                        System.out.print("Do you have a dog over 70 lbs? ");
                        boolean largeDog = someScanner.nextBoolean();
                        someScanner.nextLine();
                        
                        System.out.print("Do you have a cat over 15 lbs? ");
                        boolean largeCat = someScanner.nextBoolean();
                        someScanner.nextLine();
                        
                        if(largeDog && largeCat)
                        {
                            valid = false;                           
                        }
                        if(largeDog == true && largeCat == false)
                        {
                            System.out.print("How many large dog's do you have? ");
                            int numLargeDog = someScanner.nextInt();
                            someScanner.nextLine();
                            
                            if(numLargeDog <= 1)
                            {
                                valid = true;
                            }else{
                                valid = false;
                            }
                        }else{
                            valid = true;                                                        
                        }
                    }
                    if((hasDog == true && hasCat == false && hasBird == false)||(hasDog == true && hasCat == false && hasBird == true))
                    {
                        System.out.print("Do you have a dog over 70 lbs? ");
                        boolean largeDog = someScanner.nextBoolean();
                        someScanner.nextLine();
                        
                        if(largeDog)
                        {
                            System.out.print("How many large dog's do you have? ");
                            int numLargeDog = someScanner.nextInt();
                            someScanner.nextLine();
                            
                            if(numLargeDog <= 1)
                            {
                                valid = true;
                            }else{
                                valid = false;
                            }
                        }else{
                            valid = true;
                        }
                    }                    
                    if((hasDog == false && hasCat == false && hasBird == true)||(hasDog == false && hasCat == true && hasBird == false))
                    {
                        valid = true;
                    }
                    if((hasDog && hasCat && hasBird)||(hasDog == false && hasCat == true && hasBird == true)||(hasDog == false && hasCat == false && hasBird == false))
                    {
                        valid = false;
                    }
                }else{
                    valid = false;
                }
            }else{
                valid = false;
            }
        }else{
            valid = false;
        }
    }else{
        valid = true;
    }
    
    if(valid == true)
    {
        System.out.println("You're valid");
    }else{
        System.out.println("You're not valid");
    }
    
    }
}
