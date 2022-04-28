package com.company;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main
{
    //  Lorem ipsum    365 words
    public static void main(String[] args)
    {
        System.out.println();
        System.out.println("____________________zad1____________________");
        System.out.println();


        Zad1 zad1 = new Zad1("KOT");
        //  cos zle
        Integer[] zad1output = zad1.count();
        System.out.println(Utilities.<Integer>arrayToString(zad1output));


        System.out.println();
        System.out.println("____________________zad2____________________");
        System.out.println();


        Zad2.szukaj("Ala", "Wynik","egzamin");


        System.out.println();
        System.out.println("____________________zad3____________________");
        System.out.println();


        Zad3.sumujIZapisz("doZad3.txt");


        System.out.println();
        System.out.println("____________________zad4____________________");
        System.out.println();

        //                                      93539ygdfigidhfgidhfgui
        //Zad4.szyfruj("kot",2);


        System.out.println();
        System.out.println("____________________zad5____________________");
        System.out.println();

        Zad5.emerytura("doZad5.txt");

    }
}
