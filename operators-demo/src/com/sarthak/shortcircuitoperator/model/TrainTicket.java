package com.sarthak.shortcircuitoperator.model;

import java.util.Scanner;

public class TrainTicket {

    public static void main(String[] args) {

// if age is less then 12 & more then 60 then allow 10$ discount
// else discount amount is zero


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name ");
        String name = sc.nextLine();

        System.out.println("Enter Your Age ");
        int age = sc.nextInt();

        if(age <= 12 || age > 60){

            System.out.println("" +name +" You are eligible for the dicount of 10% ");
        }else{

            System.out.println("Sorry you are not eligible for dicount amount ");
        }

    }
}
