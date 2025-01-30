package com.bankaccount.service;

import com.bankaccount.model.BankAccount;
import com.bankaccount.model.InsufficentBalanceException;
import com.bankaccount.model.InvalidAccountException;


public class BankService {

    public void transfermoney(BankAccount sender, BankAccount reciever, double amount)
        throws InsufficentBalanceException, InvalidAccountException{

        if (reciever == null) {
            throw new InvalidAccountException("Account Not Found ");
        }

       sender.withdraw(amount);
       reciever.deposit(amount);

        System.out.println("Transaction Succesful transferred " +amount +" from " +sender.getAccountNumber() +" to " +reciever.getAccountNumber());
    }


}
