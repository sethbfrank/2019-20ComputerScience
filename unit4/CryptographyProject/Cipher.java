import java.util.ArrayList;

public class Cipher
{
    //fields
    private static int shifter = 25;
    private static String cipherAlaphabet;
    private static String plainAlaphabet = "abcdefghijklmnopqrstuvwxyz";
    //private ArrayList newMessage;
    private boolean isEncrypted;
    private Message message1;
    //private ArrayList list = new ArrayList<>();

    //constructors
    public Cipher()
    {
        message1 = new Message("gdkkn", true);
    }
    public Cipher(String message, boolean isEncrypted)
    {
        message1 = new Message(message, isEncrypted);
    }

    //methods
    public static String createCipherAlaphabet()
    {
        String s1 = plainAlaphabet.substring(shifter, plainAlaphabet.length());
        String s2 = plainAlaphabet.substring(0, shifter);
        cipherAlaphabet = s1.concat(s2);
        System.out.println(cipherAlaphabet);
        return cipherAlaphabet;
    }

    public void decrypt()
    {
        ArrayList newMessage = new ArrayList<String>();
        for(int i=0; i < message1.getMessage().length(); i++)
        {
            String s1 = message1.getMessage().substring(i, i+1);
            //System.out.println(s1);
            int num = cipherAlaphabet.indexOf(s1);
            //System.out.println(num);
            String s2 = plainAlaphabet.substring(num, num+1);
            //System.out.println(s2);
            newMessage.add(s2);
            //System.out.println(newMessage);
        }
        System.out.println();
        for(int i=0; i<newMessage.size(); i++)
        {
            System.out.print(newMessage.get(i));
        }        
    }

    public void encrypt()
    {
        ArrayList newMessage = new ArrayList<String>();
        for(int i=0; i < message1.getMessage().length(); i++)
        {
            String s1 = message1.getMessage().substring(i, i+1);
            int num = plainAlaphabet.indexOf(s1);
            String s2 = cipherAlaphabet.substring(num, num+1);
            newMessage.add(s2);
        }
        System.out.println();
        for(int i=0; i<newMessage.size(); i++)
        {
            System.out.print(newMessage.get(i));
        }        
    }
}