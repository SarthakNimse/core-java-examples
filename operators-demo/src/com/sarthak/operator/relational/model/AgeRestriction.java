package com.sarthak.operator.relational.model;

import java.util.Scanner;

public class AgeRestriction {

    public static void main(String[] args) {

//        Accept User Name & Age
//        Specific Content Acceptance Age
//        Check by if condition age matches to acceptance age
//        if yes matches then give Access
//        else Deny the Access

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Username ");
        String name = sc.nextLine();

        System.out.println("Enter Age To Access Content ");
        int age = sc.nextInt();

        int required_age= 13;

        if(age < required_age){

            System.out.println(name +" Your Access Denied " +age+" Is Less then Required Age");

        }else{

            System.out.println(name +" You Can Acces The Following U/A Content");
        }

    }
}
