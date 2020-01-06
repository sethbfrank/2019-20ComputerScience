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
    public void changeMessage(Message newMessage)
    {
        this.message = newMessage.getMessage();
        this.isEncrypted = newMessage.getIsEncrypted();
    }
    public void printMessage()
    {
        System.out.println("Message: " + message);
        System.out.println("Encrypted: " + isEncrypted);
    }

}