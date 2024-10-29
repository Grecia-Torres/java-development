package com.pluralsight.week5;

public class Card {
    private String suit;
    private String value;
    private boolean isFaceUp;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
        this.isFaceUp = false;
    }

    public String getSuit() {
// only return the suit if the card is face up
        if (isFaceUp) {
            return suit;
        } else {
            return "#";
        }
    }

    public String getValue() {
// only return the value if the card is face up
        if (isFaceUp) {
            return value;
        } else {
            return "#";
        }
    }

    public int getPointValue() {
        if (!isFaceUp) {
            return 0;
        }

        switch (value) {
            case "A":
                return 11;
            case "K":
            case "Q":
            case "J":
                return 10;
            default:
                return Integer.parseInt(value);
        }
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }

    public void flip() {
        isFaceUp = !isFaceUp;
    }
}



