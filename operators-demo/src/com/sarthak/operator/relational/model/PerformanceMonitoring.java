package com.sarthak.operator.relational.model;

import java.util.Scanner;

public class PerformanceMonitoring {

    public static void main(String[] args) {
//
// Accept CPU Usage
// Cpu Usage Shouldnt exceed 80%
// Check By Condition If Cpu usage Exceed the set limit
// if yes alert
//else send messege performance optimal

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter CPU Usage ");
        double cpu_usage = sc.nextDouble();

        double cpu_limit = 80;

        if(cpu_usage > cpu_limit){

            System.out.println("You Have Eceeded CPU Usage Limit ");
        }else{

            System.out.println("CPU Usage Is Optimal");
        }


    }
}
