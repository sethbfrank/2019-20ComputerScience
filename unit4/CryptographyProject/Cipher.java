import java.util.ArrayList;

public class Cipher
{
    //fields
    private static int shifter = 1;
    private static String cipherAlaphabet;
    private static String plainAlaphabet = "abcdefghijklmnopqrstuvwxyz";
    private String newMessage;
    private boolean isEncrypted;
    private Message message1;
    //private ArrayList list = new ArrayList<>();

    //constructors
    public Cipher()
    {
        message1 = new Message("hello", false);
    }

    //methods
    public static String createCipherAlaphabet()
    {
        String s1 = plainAlaphabet.substring(shifter, plainAlaphabet.length());
        String s2 = plainAlaphabet.substring(0, shifter);
        String s3 = s1.concat(s2);
        System.out.println(s3);
        return s3;
    }

}