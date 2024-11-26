package com.sarthak.practice1.model;

public class Books {

    String title;
    String author;
    double price;
    int quantity;
    String genre;

    @Override
    public String toString() {
        return "Books{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", genre='" + genre + '\'' +
                '}';
    }
}
