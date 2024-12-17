package com.sarthak.loops.model;

import java.util.Scanner;

public class SumOFNo {
//Write a program using a while loop to calculate the sum of all integers from 1 to a number entered by the user.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any number");
        int n =sc.nextInt();

        int i = 1;
        int sum =0;

        while(i <= n){

            sum = sum +i;
             i++;
        }
        System.out.println("Sum Of number "  +sum);

    }
}
