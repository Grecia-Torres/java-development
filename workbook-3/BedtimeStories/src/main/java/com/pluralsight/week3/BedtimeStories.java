package com.pluralsight.week3;

import java.io.FileInputStream;
import java.io.*;
import java.util.Scanner;


public class BedtimeStories {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the name of the story: ");
        String storyChoice = scanner.nextLine();

        try {
            FileInputStream fis = new FileInputStream(storyChoice + ".txt");
            Scanner scanner = new Scanner(fis);

            while(scanner.hasNextLine()) {
                String input = scanner.nextLine();
                System.out.println(input);
            }
            scanner.close();
            fis.close();
        }
        catch(IOException e) {
            System.out.println("Not one of the story choices!");
        }
    }
}
