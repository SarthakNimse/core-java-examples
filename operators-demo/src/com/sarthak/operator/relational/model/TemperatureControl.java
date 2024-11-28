package com.sarthak.operator.relational.model;

import java.util.Scanner;

public class TemperatureControl {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        Accept the room  temperature
//        accept set point for temperature to start cooling
//        check if room temperature surpass the set point
//        if yes send messege activating coolinf
//        else deny

        System.out.println("Enter the room Temperature");
        int temperature = sc.nextInt();

        int set_point = 25;

        if(temperature > set_point){

            System.out.println("Deny the Cooling system on");
        }else {

            System.out.println("Activate The Colling System");
        }



    }
}
