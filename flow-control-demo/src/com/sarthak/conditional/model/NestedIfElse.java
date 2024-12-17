package com.sarthak.conditional.model;

import java.util.Scanner;

public class NestedIfElse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Any value");

        int no = sc.nextInt();

        if (no >= 0){
            System.out.println(" No is positive or Zero ");

            if(no %2 == 0){

                System.out.println("No Is Positive And Even");

                if(no > 100){

                    System.out.println("No Is Greater then 100 ");
                }
            }else{

                System.out.println("No Is Odd");
            }if (no < 100){

                System.out.println("No Is less the 100");

            }else{
                System.out.println("No is not less then 100");
            }

            if(no %5 == 0){

                System.out.println("No is Divisible By 5");
            }else{

                System.out.println("no is not divisible by 5");
            }
        }
    }

}
