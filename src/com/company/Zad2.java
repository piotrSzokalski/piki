package com.company;

import java.util.ArrayList;

public class Zad2
{

    public static void szukaj(String nazwaPlikWe, String nazwaPlikWy, String slowo)
    {
        ArrayList<String> lines = Utilities.readFileLines(nazwaPlikWe);
        for(String line : lines)
        {
            if(line.contains(slowo))
            {
                System.out.println(line);
                Utilities.writeLineToFile("wynikZad2.txt", line);
            }
        }
    }

}
