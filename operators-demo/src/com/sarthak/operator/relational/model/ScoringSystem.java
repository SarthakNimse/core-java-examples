package com.sarthak.operator.relational.model;

import java.util.Scanner;

public class ScoringSystem {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

//        Accept the candidate Score
//        Accept the benchmark Score
//        check if candidate score surpaases benchmark
//        if yes Send congratulation
//        else didnt surpass

        System.out.println("Enter The Candidate Score ");
        int score = sc.nextInt();

        int benchmark_score = 85;

        if(score > benchmark_score){

            System.out.println("Congratulation You Have Surpassed The Benchmark Score ");

        }else{
            System.out.println("Sorry You didn't Surpass The Benchmark Score");
        }
    }
}
