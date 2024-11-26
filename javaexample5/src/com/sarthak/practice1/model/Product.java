package com.sarthak.practice1.model;

public class Product {

    String productId;
    String name;
    String description;
    double price;
    String category;

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}
