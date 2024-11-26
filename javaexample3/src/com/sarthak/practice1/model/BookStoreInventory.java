package com.sarthak.practice1.model;

import java.util.Scanner;

public class BookStoreInventory {

    public static void main(String[] args) {

//        String title;
//        String author;
//        double price;
//        int quantity;
//        String genre;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Book Title ");
        String title = sc.nextLine();

        System.out.println("Enter Author Name ");
        String author = sc.nextLine();

        System.out.println("Enter price of the Book ");
        double price= sc.nextDouble();

        System.out.println("Enter Quantity ");
        int quantity = sc.nextInt();

        System.out.println("Enter Genere of The Book ");
        String genere= sc.next();

        Books info = new Books();
        info.title = title;
        info.author = author;
        info.price = price;
        info.quantity = quantity;
        info.genre = genere;

//        String transactionId;
//        String customerFullname;
//        double finalprice;
//        String paymentMethod;

        System.out.println("Enter transaction Id ");
        String transactionId = sc.next();

        System.out.println("Enter Customer Full Name");
        String customerFullname = sc.next();

        System.out.println("Enter Final price of the Book ");
        double finalprice= sc.nextDouble();

        System.out.println("Enter Payement Method ");
        String payementMethod= sc.next();

        Transactions details = new Transactions();
        details.transactionId = transactionId;
        details.customerFullname = customerFullname;
        details.finalprice = finalprice;
        details.paymentMethod =payementMethod;


        System.out.println("Full Details Of Book Inventory " +info + " " + details);







    }
}
