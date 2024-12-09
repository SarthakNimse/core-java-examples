package com.sarthak.program1.model;

public class Person {
    String firstName;
    String lastname;

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}