package com.company;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileHandler {

    public static String readFromFile(String fileName, int lineNumber) {
        // read and print out the contents of a text file
        // using all the exception handling best practices

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine();
            //ArrayList<String> lines = new ArrayList<>();

            int lineCount = 0;
            while (line != null) {
                if (line != null) {
                    if (lineCount == lineNumber) {
                        return (line);
                    }
                    //lines.add(line);
                    line = br.readLine();
                    lineCount++;
                }
            }
            //return (lines);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        //return (null);
        return("EOF");
    }


    public static void writeToFile(String fileName, String text, boolean append) {
        // write text to fileName
        // either overwriting (append = false)
        // or appending (append = true)
        // using all the exception handling best practices

        try (PrintWriter pr = new PrintWriter(new FileWriter(fileName, append))) {
            pr.println(text);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
