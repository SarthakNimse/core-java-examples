package com.sarthak.operator.relational.model;

import java.util.Scanner;

public class AttendanceCheck {

    public static void main(String[] args) {


//        Accept the Participant number from user
//        Accept required number for event from user
//        check if participant number exceed required number
//        if yes alert
//        else send messege

        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the total number of Participant participated In event");
        int participant = sc.nextInt();

        int required_number = 115;

        if(participant > required_number){

            System.out.println("Participant number exceeds the required number");
        }else{

            System.out.println("Fill More Participant");
        }
    }
}
