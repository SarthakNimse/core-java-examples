package com.sarthak.operator.relational.model;

import java.util.Scanner;

public class BankBalanceValidation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        Accept the withdrawl Amount From User
//        Accept The Current Balance
//        Check If Withdrawl Ammount Exceeds Current Balance
//        if Yes Alert
//        else send messege transaction Succesful

        System.out.println("Enter The Withdrawl Amount ");
        double amount = sc.nextDouble();

        double current_balance = 5000.20;

        if(amount > current_balance){

            System.out.println("Withdrawl Amount Exceeds Current Balance Transaction Failed");
        }else{

            System.out.println("Transaction Succesful");
        }



    }
}
