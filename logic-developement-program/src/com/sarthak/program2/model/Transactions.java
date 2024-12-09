package com.sarthak.program2.model;

public class Transactions {
    String transactionId;
    String customerFullname;
    double finalprice;
    String paymentMethod;

    @Override
    public String toString() {
        return "Transactions{" +
                "transactionId='" + transactionId + '\'' +
                ", customerFullname='" + customerFullname + '\'' +
                ", finalprice=" + finalprice +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }

}
