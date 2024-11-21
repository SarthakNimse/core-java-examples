package com.sarthak.practice.model;

public class Payementinfo {

    String payement_type;
    String payement_status;
    String payement_platform;

    @Override
    public String toString() {
        return "Payementinfo{" +
                "payement_type='" + payement_type + '\'' +
                ", payement_status='" + payement_status + '\'' +
                ", payement_platform='" + payement_platform + '\'' +
                '}';
    }
}
