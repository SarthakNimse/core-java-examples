package com.sarthak.operator.relational.model;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Any Positive Number ");
        int no = sc.nextInt();

        if(no % 2 == 0){
            System.out.println("Given Number Is Even Number");
        }else{
            System.out.println("Given Number Is Odd Number ");
        }
    }
}
