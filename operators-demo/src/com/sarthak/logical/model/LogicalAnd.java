package com.sarthak.logical.model;

import java.util.Scanner;

public class LogicalAnd {

    public static void main(String[] args) {

//       Accept Any positive number from user
//       Using && operator check if the given number is in specific range og between 100 to 499

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter An Any Positive Number");
        int no = sc.nextInt();

        if (no > 99 && no < 500){

            System.out.println("Given Number Is in specific range of 100 to 499");
        }else{

            System.out.println("Number is not in specific range");
        }
    }
}
