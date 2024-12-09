package com.sarthak.program3.model;

import java.util.Scanner;

public class JobApplication {
    public static void main(String[] args) {

//        String title;
//        String company;
//        String location;
//        String jobType ;
//        double salary;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Job Title ");
        String title = sc.nextLine();

        System.out.println("Enter company Name ");
        String company = sc.nextLine();

        System.out.println("Enter job location ");
        String location = sc.next();

        System.out.println("Enter job type ");
        String jobType= sc.next();

        System.out.println("Enter Salary  ");
        double salary= sc.nextDouble();

        JobDescription info = new JobDescription();
        info.title = title;
        info.company= company;
        info.location= location;
        info.jobType= jobType;
        info.salary= salary;

//        String applicantId;
//        String name;
//        String email;
//        String phoneNumber;


        System.out.println("Enter applicant Id ");
        String applicantId = sc.next();

        System.out.println("Enter Full Name oF candidate ");
        String name = sc.next();

        System.out.println("Enter email of the candidate ");
        String email = sc.next();

        System.out.println("Enter phone Number Of candidate ");
        String phoneNumber= sc.next();

        Applicant details = new Applicant();
        details.applicantId=applicantId;
        details.name=name;
        details.email=email;
        details.phoneNumber=phoneNumber;


        System.out.println("Full details of comapny vacancy and job description " +info + " " +details);

    }
}

