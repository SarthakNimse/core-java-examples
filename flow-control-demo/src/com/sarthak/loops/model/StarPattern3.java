package com.sarthak.loops.model;

public class StarPattern3 {

    public static void main(String[] args) {

        int rows = 5;
        int i =1;

        while(i <= rows){

            int spaces = rows - i ;
            int j =1;

            while(spaces > 0){
                System.out.print(" ");
                spaces--;


            }

            while(j <= i ){
                System.out.print("*");
                j++;

            }
            System.out.println();
            i++;
        }


    }}