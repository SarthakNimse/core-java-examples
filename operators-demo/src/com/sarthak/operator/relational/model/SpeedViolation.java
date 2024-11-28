package com.sarthak.operator.relational.model;

import java.util.Scanner;

public class SpeedViolation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        Accept username & Vehicle Speed
//        minimum Speed Limit On road
//        check by if condition Did user was doing overspeeding if yes give challan
//        else send messege

        System.out.println("Enter The Driver's Name ");
        String name = sc.nextLine();

        System.out.println("Enter THe Speed Driver Was Driving The Vehicle");
        int speed = sc.nextInt();

        int speed_limit = 80;

        if(speed < speed_limit){

            System.out.println("Driver Was Driving The Vehicle In Speed Limit");
        }else{

            System.out.println("Driver Was Overspeeding Fine Sould Be Imposed On Driver");
        }

    }
}
