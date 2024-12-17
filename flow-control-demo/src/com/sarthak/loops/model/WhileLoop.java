package com.sarthak.loops.model;

public class WhileLoop {

    public static void main(String[] args) {

//Write a program that uses a while loop to print all the even numbers between 1 and 50.

        int no = 1;

        while(no <= 50){

            if(no %2 == 0){

                System.out.print(+no);
            }
            System.out.println("");
            no++;
        }
    }
}
