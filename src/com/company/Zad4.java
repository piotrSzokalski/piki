package com.company;

import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Zad4
{
    public static void szyfruj(String nazwaWe, int przesun)
    {
         String data =  Utilities.readFileContents(nazwaWe);
         StringBuilder cipher = new StringBuilder();
         przesun%=27;
         int l;
         for(int i = 0; i < data.length(); i++ )
         {
             if(Character.isAlphabetic(data.charAt(i)))
             {
                 if(data.charAt(i) < 'Z')
                 {
                     l = data.charAt(i) + przesun;
                 }
                 else
                 {

                 }
             }
             else
                 cipher.append(data.charAt('e'));

         }
         System.out.println(cipher);
    }
    public static void deszyfruj(String nazwaWe, int przesun)
    {

    }
}
