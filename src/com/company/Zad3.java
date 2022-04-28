package com.company;

import java.util.ArrayList;

public class Zad3
{
    public static void sumujIZapisz(String nazwaPliku)
    {
        ArrayList<String> data = Utilities.readFileLines(nazwaPliku);
        int sum = 0;
        for(String line : data)
        {
            try
            {
                sum += Integer.parseInt(line);
            }
            catch (Exception e)
            {
                sum += 0;
            }

        }
        sum++;
        //Utilities.writeLineToFile(nazwaPliku, "\n");
        Utilities.writeLineToFile(nazwaPliku, Integer.toString(sum));
    }

}
