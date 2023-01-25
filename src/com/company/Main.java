package com.company;

public class Main {

    public static void main(String[] args) {
        for(int x = 0; x < 2; x++) {
            String text = FileHandler.readFromFile("hello.txt", x);
            FileHandler.writeToFile("testing123.txt",text,true);
        }
    }
}
