package com.sarthak.program3.model;

public class Applicant {

    String applicantId;
    String name;
    String email;
    String phoneNumber;

    @Override
    public String toString() {
        return "Applicant{" +
                "applicantId='" + applicantId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

}
