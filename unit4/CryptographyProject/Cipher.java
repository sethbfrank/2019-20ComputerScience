//import java.util.ArrayList;

public class Cipher
{
    //fields
    private String cipherAlphabet;
    private String plainAlphabet;
    private String newMessageString = "";
    
    //constructors
    public Cipher(int shifter)
    {
        plainAlphabet = "abcdefghijklmnopqrstuvwxyz";
        cipherAlphabet = Cipher.createCipherAlaphabet(plainAlphabet, shifter);
    }

    //methods
    private static String createCipherAlaphabet(String plainAlphabet, int shifter)
    {
        String s1 = plainAlphabet.substring(shifter, plainAlphabet.length());
        String s2 = plainAlphabet.substring(0, shifter);
        String s3 = s1.concat(s2);
        System.out.println(s3);
        return s3;
    }

    public Message decrypt(Message theMessage)
    {
        if(theMessage.getIsEncrypted() == false)
        {
            System.out.print("Error, can't decrypt a decrypted message");
        }else{
            //loops through this for the length of the message
            for(int i=0; i < theMessage.getMessage().length(); i++)
            {
                //finds the first letter in the message
                String s1 = theMessage.getMessage().substring(i, i+1);
                //find the index in the cipherAlphabet
                int num = cipherAlphabet.indexOf(s1);
                //creates a string with the letter in the plain alphabet
                String s2 = plainAlphabet.substring(num, num+1);
                //adds the letter to the new message
                newMessageString = newMessageString+s2;
            }
            theMessage = new Message(newMessageString, false);
            theMessage.printMessage();            
        }
        return theMessage;
    }

    public Message encrypt(Message theMessage)
    {
        if(theMessage.getIsEncrypted() == true)
        {
            System.out.println("Error, can't encrypt an encrypted message");
        }else{
            //loops through this for the length of the message
            for(int i=0; i < theMessage.getMessage().length(); i++)
            {
                //finds the first letter in the message
                String s1 = theMessage.getMessage().substring(i, i+1);
                //find the index in the cipherAlphabet
                int num = plainAlphabet.indexOf(s1);
                //creates a string with the letter in the plain alphabet
                String s2 = cipherAlphabet.substring(num, num+1);
                //adds the letter to the new message
                newMessageString = newMessageString+s2;
            }
            theMessage = new Message(newMessageString, true);
            //this.theMessage = theMessage;
            theMessage.printMessage();
            //this.theMessage = theMessage;
        }
        return theMessage;
    }


    /*public void oldEncrypt()
    {
        ArrayList newMessage = new ArrayList<String>();
        for(int i=0; i < theMessage.getMessage().length(); i++)
        {
            String s1 = theMessage.getMessage().substring(i, i+1);
            int num = plainAlphabet.indexOf(s1);
            String s2 = cipherAlphabet.substring(num, num+1);
            newMessage.add(s2);
        }
        System.out.println(newMessage);
        for(int i=0; i<newMessage.size(); i++)
        {
            System.out.print(newMessage.get(i));
            //String returnMessage = returnMessage + newMessage.get(i);
        }        
        //System.out.println(returnMessage);
    }*/
}