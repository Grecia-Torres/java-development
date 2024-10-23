package com.pluralsight.week5;

public class Book {
    String title;
    String author;
    double price;
    String isbn;

    public Book(String title, String author, double price, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public void displayBook() {
        System.out.println("Title: " + title + "Author: " + author + "Price: " + price + "ISBN: " + isbn);
    }
    public void discount(double discount) {
        this.price = this.price * discount;

    }

}


