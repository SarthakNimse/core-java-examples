package com.sarthak.operator.relational.model;

import java.util.Scanner;

public class Grading {

    public static void main(String[] args) {


//        Accept username &Grades he got
//        minimum required marks to pass
//        check by if condition he got minimum marks to pass
//        else send messege

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter THe Student's Name ");
        String name = sc.nextLine();

        System.out.println("Enter The Student's Grade ");
        int grades =sc.nextInt();

        int passing_grade = 35;

        if(grades < passing_grade){

            System.out.println(name+" You Are Failed Study Hard Next Time Your "+grades+" Less then Required Grades For Passing" );
        }else{

            System.out.println(name+" Congratulation You Have Passed The Exam");
        }
    }
}
