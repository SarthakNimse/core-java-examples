package com.bankaccount.model;

public class InsufficentBalanceException extends Exception {
    public InsufficentBalanceException(String message){
        super(message);
    }
}
