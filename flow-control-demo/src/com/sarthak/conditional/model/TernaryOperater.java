package com.sarthak.conditional.model;

import java.util.Scanner;

public class TernaryOperater {

//    usin g ternary operagter find out if the number is even or odd

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Any Positive Number");
        int no = sc.nextInt();

        System.out.println((no % 2 == 0) ? ("Number is Even") : ("No is Odd "));
    }
}
