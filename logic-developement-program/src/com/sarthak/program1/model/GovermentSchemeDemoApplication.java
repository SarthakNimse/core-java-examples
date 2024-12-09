package com.sarthak.program1.model;

import java.util.Scanner;

public class GovermentSchemeDemoApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your First Name ");
        String firstname = sc.nextLine();

        System.out.println("Enter Your Last Name ");
        String lastname =sc.nextLine();

        Person person = new Person();
        person.firstName = firstname;
        person.lastname = lastname;


//        String houseno;
//        String buildingname;
//        String city;
//        String district;
//        String state;
//        int pin;

        System.out.println("Enter Your house no ");
        String houseno = sc.nextLine();

        System.out.println("Enter Your building name ");
        String buildingname =sc.nextLine();

        System.out.println("Enter your city ");
        String city = sc.nextLine();

        System.out.println("Enter Your district ");
        String district =sc.nextLine();

        System.out.println("Enter Your state ");
        String state = sc.nextLine();

        System.out.println("Enter Your Pin Number ");
        int pin =sc.nextInt();


        Address address = new Address();
        address.houseno=houseno;
        address.buildingname=buildingname;
        address.city=city;
        address.district=district;
        address.state=state;
        address.pin=pin;


        System.out.println("All Details of the person " +person + " " + address);






    }

}
