package com.sarthak.program5.model;

public class Organizer {

    String organizerId;
    String Organizername;
    String contactInfo;


    @Override
    public String toString() {
        return "Organizer{" +
                "organizerId='" + organizerId + '\'' +
                ", Organizername='" + Organizername + '\'' +
                ", contactInfo='" + contactInfo + '\'' +
                '}';
    }
}