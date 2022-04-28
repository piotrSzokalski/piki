package com.company;

public abstract class Zad
{
    protected String data;
    public Zad(String pathname)
    {
        data = Utilities.readFileContents(pathname);
    }
}
