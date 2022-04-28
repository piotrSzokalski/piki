package com.company;

import java.util.ArrayList;

public class Zad5
{
    public static void emerytura(String nazwaPliku)
    {
        ArrayList<String> data = Utilities.readFileLines(nazwaPliku);
        StringBuilder buffer = new StringBuilder();
        int separatorIndex = 0;
        for(String record : data)
        {
            separatorIndex = record.indexOf(' ');
            buffer.append(record.substring(0, separatorIndex));
            buffer.append(' ');
            separatorIndex =record.indexOf(' ', separatorIndex + 1);
            buffer.append(record.substring())

            int b = 10;
        }
    }
}
