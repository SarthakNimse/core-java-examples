package com.sarthak.program5.model;

public class Ticket {

    String ticketId;
    String participantName;
    String event;
    double price;

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId='" + ticketId + '\'' +
                ", participantName='" + participantName + '\'' +
                ", event='" + event + '\'' +
                ", price=" + price +
                '}';
    }
}
