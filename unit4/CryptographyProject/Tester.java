public class Tester
{
    public static void main(String args[])
    {
        Message m1 = new Message("hello", false);
        
        //Cipher.createCipherAlaphabet(25);

        Cipher c1 = new Cipher(25);
        c1.encrypt(m1);
        //c1.printCipherInfo();

        //m1.printMessage();

        //c1.decrypt(m1);
        //c1.printCipherInfo();

        
        /*Message m2 = new Message("gdkkn", false);
        
        Cipher.createCipherAlaphabet(25);

        Cipher c2 = new Cipher(m2);
        c2.decrypt(m2);
        c2.printCipherInfo();*/

    }
}