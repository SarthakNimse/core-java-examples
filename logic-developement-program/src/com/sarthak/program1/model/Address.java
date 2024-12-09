package com.sarthak.program1.model;

public class Address {

    String houseno;
    String buildingname;
    String city;
    String district;
    String state;
    int pin;

    @Override
    public String toString() {
        return "Address{" +
                "houseno='" + houseno + '\'' +
                ", buildingname='" + buildingname + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", state='" + state + '\'' +
                ", pin=" + pin +
                '}';
    }
}


