package com.sarthak.practice2.model;

public class JobDescription {

    String title;
    String company;
    String location;
    String jobType ;
    double salary;

    @Override
    public String toString() {
        return "JobDescription{" +
                "title='" + title + '\'' +
                ", company='" + company + '\'' +
                ", location='" + location + '\'' +
                ", jobType='" + jobType + '\'' +
                ", salary=" + salary +
                '}';
    }
}
