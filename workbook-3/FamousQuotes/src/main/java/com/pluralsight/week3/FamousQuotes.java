package com.pluralsight.week3;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] quotes = {
                    "\"It does not do well to dwell on dreams and forget to live.\" \n― Albus Dumbledore",
                    "\"Do not pity the dead, Harry. Pity the living, and, above all, those who live without love.” \n- Albus Dumbledore",
                    "\"Happiness can be found, even in the darkest of times, if one only remembers to turn on the light.\" \n- Albus Dumbledore",
                    "\"You have brains in your head. You have feet in your shoes. You can steer yourself any direction you choose.\" \n- Dr. Seuss",
                    "\"The greatest glory in living lies not in never falling, but in rising every time we fall.\" \n– Nelson Mandela",
                    "\"Keep smiling, because life is a beautiful thing and there's so much to smile about.\" \n– Marilyn Monroe",
                    "\"If you look at what you have in life, you'll always have more. If you look at what you don't have in life, you'll never have enough.\" \n- Oprah Winfrey ",
                    "\"Spread love everywhere you go. Let no one ever come to you without leaving happier.\" \n- Mother Teresa",
                    "\"Be yourself; everyone else is already taken.\" \n- Oscar Wilde",
                    "\"Dreaming, after all, is a form of planning.\" \n– Gloria Steinem"
            };

        while (true) {
            try {
                System.out.println("Please select a number between 1 and 10: ");
                int number = scanner.nextInt();
                if (number == 0) {
                    break;
                } else if (number < 1 || number > 10) {
                    System.out.println("Your number was out of range. Please enter a number between 1 and 10.");
                } else {
                    number--;
                    System.out.println(quotes[number]);
                }
            } catch(Exception e){
                    System.out.println("Your number was out of range!");
                    scanner.next();
                }
            }


        scanner.close();


    }
}

