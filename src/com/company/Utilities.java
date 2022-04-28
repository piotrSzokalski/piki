package com.company;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Utilities
{
    public static String readFileContents(String path)
    {
        try
        {
            return new String(Files.readAllBytes(Paths.get(path)));
        }
        catch (Exception e)
        {
            System.out.print("Error reading file content");
            e.getStackTrace();
            return "";
        }
    }
    public static ArrayList<String> readFileLines(String path)
    {
        try
        {
            ArrayList<String> lines = new ArrayList<String>();
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine())
            {
                lines.add(scanner.nextLine());
            }
            return lines;
        }
        catch (Exception e)
        {
            System.out.println("Error reading file into lines");
            e.getStackTrace();
            return null;
        }
    }
    public static void writeLineToFile(String path, String data)
    {
        try
        {
            File file = new File(path);
            FileWriter wr = new FileWriter(file, true);
            wr.append(data);
            wr.append("\n");
            wr.close();
        }
        catch (Exception e)
        {
            System.out.println("Erro writing to file");
            e.getStackTrace();
        }
    }
    public static <T> String arrayToString(T[] array)
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < array.length; i++)
        {
            sb.append(array[i]);
            sb.append(" ");
        }
        return sb.toString();
    }
}
