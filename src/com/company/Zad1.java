package com.company;


public class Zad1 extends Zad
{
    public Zad1(String pathname)
    {
        super(pathname);
    }
    private int countCharacters()
    {
        return data.length();
    }
    private int countWhiteSpce()
    {
        int count = 0;
        for(int i = 0; i < data.length(); i++)
            if(Character.isWhitespace(data.charAt(i)))
                count++;
        return count;
    }
    private int countWords()
    {
        int count = 0;
        int i = 0;
        int lenght;
        while(i < data.length())
        {
            lenght = 0;
            while(Character.isLetterOrDigit(data.charAt(i)))
            {
                lenght++;
                i++;
            }
            if(lenght > 0)
                count++;
            i++;
        }
        return count;
    }
    public Integer[] count()
    {
        return new Integer[]  {countCharacters(), countWhiteSpce(), countWords()};
    }


}
