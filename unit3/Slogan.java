//********************************************************************
//  Slogan.java       Author: Lewis/Loftus
//
//  Represents a single slogan string.
//********************************************************************

public class Slogan
{
    private String phrase;
    private static int count = 0;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the slogan and counts the number of
    //  instances created.
    //-----------------------------------------------------------------
    public Slogan(String str)
    {
        phrase = str;
        count++;
    }

    //-----------------------------------------------------------------
    //  Returns this slogan as a string.
    //-----------------------------------------------------------------
    public String getSlogan()
    {
        return phrase;
    }

    //-----------------------------------------------------------------
    //  Returns the number of instances of this class that have been
    //  created.
    //-----------------------------------------------------------------
    public static int getCount()
    {
        return count;
    }
}
