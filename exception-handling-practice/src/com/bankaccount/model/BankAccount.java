package com.bankaccount.model;

public class BankAccount{
    private String accountNumber;
    private double balance;

    public BankAccount(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }






    public void withdraw(double amount)throws InsufficentBalanceException{

        if(amount > balance) {
            throw new InsufficentBalanceException("Insufficient Balance In Your Account " + balance);
        }
        balance -= amount;
        System.out.println("Your Withdrawl Is Succesful! Current Balance " +balance);

    }

    public void deposit(double amount){
        balance += amount;

        System.out.println("Your Deposit Is Succesful! Current balance " +balance);

    }
}
