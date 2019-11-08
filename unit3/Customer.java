import jdk.javadoc.internal.doclets.toolkit.resources.doclets;

public class Customer
{
    private static int nextAccNum = 1;
    private String name;
    private int currAccNum;

    public Customer(String name)
    {
        name = n;
        currAccNum = nextAccNum;
        nextAccNum++;
    }

    public String billNotice(double amount)
    {
        String info = (name + ", account number " + currAccNum + ", please pay " + amount);
        return info;
    }

    public int getNextNum()
    {
        return nextAccNum;
    }

    public void updateName(String name)
    {
        this.name = name;
    }

}