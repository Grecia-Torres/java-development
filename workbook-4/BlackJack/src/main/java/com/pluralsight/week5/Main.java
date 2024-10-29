package com.pluralsight.week5;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Player> players = new ArrayList<>();

        Deck deck = new Deck();
        deck.shuffle();

        while (true) {
            System.out.println("Enter the name of the player: ");
            String names = scanner.nextLine();
            players.add(new Player(names, new Hand()));
        }




// deal 5 cards
            for (int i = 0; i < 5; i++) {
// get a card from the deck
                Card card = deck.deal();
// deal that card to the hand
                hand1.Deal(card);
            }
            int handValue = hand1.getValue();
            System.out.println("This hand is worth " + handValue);
        }
    }
