package com.sarthak.practice.model;

public class Studentinfo {

    String fistname;
    String lastname;
    String departement;
    int student_id;

    @Override
    public String toString() {
        return "Studentinfo{" +
                "fistname='" + fistname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", departement='" + departement + '\'' +
                ", student_id=" + student_id +
                '}';
    }
}
