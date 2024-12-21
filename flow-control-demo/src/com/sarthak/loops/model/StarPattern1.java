package com.sarthak.loops.model;

public class StarPattern1 {

    public static void main(String[] args) {

        int no = 0;

        while (no < 5) {

            int innerCounter = 0;

            while (innerCounter <= no) {

                System.out.print("*");
                innerCounter++;

            }
            no++;
            System.out.println("");


        }
    }
}
