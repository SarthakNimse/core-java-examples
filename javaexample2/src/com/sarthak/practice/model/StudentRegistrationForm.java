package com.sarthak.practice.model;

import java.util.Scanner;

public class StudentRegistrationForm {

    public static void main(String[] args) {

//        String fistname;
//        String lastname;
//        String departement;
//        int Student_id;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your First Name");
        String firstname = sc.nextLine();

        System.out.println("Enter Your Last Name");
        String lastname = sc.nextLine();

        System.out.println("Enter Your Departement Name");
        String departement = sc.nextLine();

        System.out.println("Enter Your Student Id ");
        int student_id = sc.nextInt();

        Studentinfo info = new Studentinfo();
        info.fistname=firstname;
        info.lastname=lastname;
        info.departement=departement;
        info.student_id=student_id;

//        String payement_type;
//        String payement_status;
//        String payement_platform;


        System.out.println("Enter Your Payement Type");
        String payement_type = sc.next();

        System.out.println("Enter Your Payement Status");
        String payement_status = sc.next();

        System.out.println("Enter Your Payement_Platform;");
        String payement_platform = sc.next();

        Payementinfo payement = new Payementinfo();
        payement.payement_type =payement_type;
        payement.payement_status =payement_status;
        payement.payement_platform =payement_platform;


        System.out.println("All Details Of Student Registration Are " +info + "   " +payement);





    }
}
