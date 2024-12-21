package com.sarthak.loops.model;

public class StarPattern2 {

//*****
//****
//***
//**
//*
public static void main(String[] args) {

    int no = 5;

    while (no > 0){

        int innercounter = 0;
        while(innercounter < no){

            System.out.print("*");
            innercounter++;


        }
        no--;
        System.out.println("");
    }
}
}
