package com.sarthak.practice.model;

public class Event {

    String eventId;
    String name;
    String description;
    String location;

    @Override
    public String toString() {
        return "Event{" +
                "eventId='" + eventId + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
