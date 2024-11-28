package com.sarthak.operator.relational.model;

import java.util.Scanner;

public class StockMonitoring {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        Accept User Name & Thrashold Price
//        Minimum Thrashhold limit
//        Check by if condition Your thrashold Price  matches to Thrashhold pricew
//        if yes matches then Alert Inventory Falls Below Minimum Thrashold
//        else Send Msg Your Portfolio Is good

        System.out.println("Enter Your Username");
        String name = sc.nextLine();

        System.out.println("Enter Your Thrashhold price ");
        double price = sc.nextDouble();

        double min_price = 514;

        if(price < min_price){

            System.out.println(name+" ALERT Your Thrashold Falls Below Minimum Thrashhold Price " +price);

        }else{

            System.out.println(name+" Your Portfolio Looks Good ANd Above Minimum Price " +min_price);
        }


    }
}
