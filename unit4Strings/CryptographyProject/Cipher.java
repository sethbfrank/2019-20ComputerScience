package CryptographyProject;

//import java.util.ArrayList;

public class Cipher
{
    //fields
    private String cipherAlphabet;
    private String plainAlphabet;
    //private String newMessageString = "";
    
    //constructors
    public Cipher(int shifter)
    {
        plainAlphabet = "abcdefghijklmnopqrstuvwxyz";
        cipherAlphabet = this.createCipherAlaphabet(plainAlphabet, shifter);
    }

    //methods
    private String createCipherAlaphabet(String plainAlphabet, int shifter)
    {
        String s1 = plainAlphabet.substring(shifter, plainAlphabet.length());
        String s2 = plainAlphabet.substring(0, shifter);
        String s3 = s1.concat(s2);
        return s3;
    }

    public Message decrypt(Message theMessage)
    {
        if(theMessage.getIsEncrypted() == false)
        {
            System.out.print("Error, can't decrypt a decrypted message");
        }else{
            theMessage.getMessage().toLowerCase();
            String newMessageString = "";
            //loops through this for the length of the message
            for(int i=0; i < theMessage.getMessage().length(); i++)
            {
                //finds the certain letter in the message
                String s1 = theMessage.getMessage().substring(i, i+1);
                //adds a space if needed
                if(s1.equals(" "))
                {
                    newMessageString = newMessageString+s1;
                }else{
                    //find the index in the cipherAlphabet
                    int num = cipherAlphabet.indexOf(s1);
                    //creates a string with the letter in the plain alphabet
                    String s2 = plainAlphabet.substring(num, num+1);
                    //adds the letter to the new message
                    newMessageString = newMessageString+s2;
                }
            }
            theMessage = new Message(newMessageString, false);            
        }
        return theMessage;
    }

    public Message encrypt(Message theMessage)
    {
        if(theMessage.getIsEncrypted() == true)
        {
            System.out.println("Error, can't encrypt an encrypted message");
        }else{
            theMessage.getMessage().toLowerCase();
            String newMessageString = "";
            //loops through this for the length of the message
            for(int i=0; i < theMessage.getMessage().length(); i++)
            {
                //finds the certain letter in the message
                String s1 = theMessage.getMessage().substring(i, i+1);
                if(s1.equals(" "))
                {
                    newMessageString = newMessageString+s1;
                }else{
                    //find the index in the cipherAlphabet
                    int num = plainAlphabet.indexOf(s1);
                    //creates a string with the letter in the plain alphabet
                    String s2 = cipherAlphabet.substring(num, num+1);
                    //adds the letter to the new message
                    newMessageString = newMessageString+s2;
                }
            }
            theMessage = new Message(newMessageString, true);
        }
        return theMessage;
    }
    
}