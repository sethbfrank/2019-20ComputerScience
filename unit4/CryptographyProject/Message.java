public class Message
{
    //fields
    private String message;
    private boolean isEncrypted;

    //constructors
    public Message()
    {
        message = "default";
        isEncrypted = false;
    }
    
    public Message(String message, boolean isEncrypted)
    {
        this.message = message;
        this.isEncrypted = isEncrypted;
    }


    //methods
    public String getMessage()
    {
        return message;
    }
    public boolean getIsEncrypted()
    {
        return isEncrypted;
    }

}