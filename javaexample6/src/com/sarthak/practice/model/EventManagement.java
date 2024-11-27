package com.sarthak.practice.model;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EventManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        String eventId
//        String name
//        String description
//        String location


        System.out.println("Enter Event Id ");
        String eventId = sc.nextLine();

        System.out.println("Enter Event Name ");
        String name = sc.nextLine();

        System.out.println("Enter Event description ");
        String description = sc.nextLine();

        System.out.println("Enter Event location ");
        String location = sc.nextLine();

        Event info = new Event();
        info.eventId=eventId;
        info.name=name;
        info.description=description;
        info.location= location;

//        String organizerId
//        String name
//        String contactInfo

        System.out.println("Enter Organizer Id ");
        String organizerId = sc.nextLine();

        System.out.println("Enter Organizer Name ");
        String organizername = sc.nextLine();

        System.out.println("Enter Contact Information ");
        String contactInfo = sc.nextLine();
        

        Organizer details = new Organizer();
        details.organizerId=organizerId;
        details.Organizername=organizername;
        details.contactInfo=contactInfo;

//        String ticketId;
//        String participantName;
//        String event;
//        double price;

        System.out.println("Enter Ticket Id ");
        String ticketId = sc.nextLine();

        System.out.println("Enter Participant Name ");
        String participantName = sc.nextLine();

        System.out.println("Enter Event Details ");
        String event = sc.nextLine();

        System.out.println("Enter The Price Of The Ticket ");
        double price = sc.nextDouble();

        Ticket ticketinfo = new Ticket();
        ticketinfo.ticketId=ticketId;
        ticketinfo.participantName=participantName;
        ticketinfo.event=event;
        ticketinfo.price=price;

        System.out.println("All Details Regarding Event Organizer & Ticket Are "+info +"" +details+ "" +ticketinfo);










    }
}


