public class Tester
{
    public static void main(String args[])
    {
        /*Cipher.createCipherAlaphabet();
        
        Cipher c1 = new Cipher();
        c1.decrypt();

        Cipher c2 = new Cipher("hello", false);
        c2.encrypt();*/

        Message m1 = new Message("hello", false);
        System.out.println(m1.getMessage());
        System.out.println(m1.getIsEncrypted());

        Message m2 = new Message();
        System.out.println(m2.getMessage());
        System.out.println(m2.getIsEncrypted());        
    }
}