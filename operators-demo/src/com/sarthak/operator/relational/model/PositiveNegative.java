package com.sarthak.operator.relational.model;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Any Positive Or Negative Number ");
        int no = sc.nextInt();

        if(no > 0){
            System.out.println("Given Number " +no + " Is Positive");
        }else{
            System.out.println("Given Number " + no + " Is Negative ");
        }
    }
}
