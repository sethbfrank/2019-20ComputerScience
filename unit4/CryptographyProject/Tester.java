package CryptographyProject;

public class Tester
{
    public static void main(String args[])
    {
        Message m1 = new Message("hello hello", false);
        Message m4 = new Message("gdkkn gdkkn", true);
        Message m6 = new Message();
        
        Cipher c25 = new Cipher(25);
        Message m2 = c25.encrypt(m1);
        System.out.println(m2.getMessage());
        Message m3 = c25.decrypt(m2);
        System.out.println(m3.getMessage());

        Message m5 = c25.decrypt(m4);
        System.out.println(m5.getMessage());

        Cipher c14 = new Cipher(14);
        Message m7 = c14.encrypt(m6);
        System.out.println(m7.getMessage());
        
    }
}