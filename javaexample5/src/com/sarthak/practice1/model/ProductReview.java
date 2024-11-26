package com.sarthak.practice1.model;

import java.util.Scanner;

public class ProductReview {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        String productId
//        String name
//        String description
//        double price
//        String category

        System.out.println("Enter Product Id ");
        String productId = sc.nextLine();

        System.out.println("Enter Product Name ");
        String name = sc.nextLine();

        System.out.println("Enter Product description ");
        String description = sc.next();

        System.out.println("Enter Product Price ");
        double price= sc.nextDouble();

        System.out.println("Enter category of the product  ");
        String category= sc.next();

        Product info = new Product();
        info.productId=productId;
        info.name= name;
        info.description=description;
        info.price=price;
        info.category=category;


//        String reviewId;
//        String user;
//        int rating;
//        String comment;
//
        System.out.println("Enter Review Id ");
        String reviewId = sc.next();

        System.out.println("Enter User Name ");
        String user = sc.next();


        System.out.println("Enter Rating Of The Product ");
        int rating= sc.nextInt();

        System.out.println("Enter comment you want to add  ");
        String comment= sc.next();

        UserReview details = new UserReview();
        details.reviewId=reviewId;
        details.user=user;
        details.rating=rating;
        details.comment=comment;

        System.out.println("Enter Product Details And Review Of Customer " +info + "" +details);


    }
}
