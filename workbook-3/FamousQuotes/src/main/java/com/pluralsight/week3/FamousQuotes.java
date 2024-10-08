package com.pluralsight.week3;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        String[] quotes = {
                "It does not do well to dwell on dreams and forget to live. ― Albus Dumbledore" +
                        "Do not pity the dead, Harry. Pity the living, and, above all, those who live without love.” Albus Dumbledore" +
                        " Happiness can be found, even in the darkest of times, if one only remembers to turn on the light.― Albus Dumbledore" +
                        "You have brains in your head. You have feet in your shoes. You can steer yourself any direction you choose. -Dr. Seuss" +
                        "The greatest glory in living lies not in never falling, but in rising every time we fall.” – Nelson Mandela" +
                        "Keep smiling, because life is a beautiful thing and there's so much to smile about.” – Marilyn Monroe" +
                        "If you look at what you have in life, you'll always have more. If you look at what you don't have in life, you'll never have enough. -Oprah Winfrey " +
                        "Spread love everywhere you go. Let no one ever come to you without leaving happier. -Mother Teresa" +
                        "Be yourself; everyone else is already taken. -Oscar Wilde" +
                        "Dreaming, after all, is a form of planning.” – Gloria Steinem"
        };
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select a number between 1 and 10: ");
        int number = scanner.nextInt();
        System.out.println("Quote: " + quotes[number - 1]);

        scanner.close();


    }
}

