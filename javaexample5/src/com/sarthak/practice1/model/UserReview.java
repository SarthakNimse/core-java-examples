package com.sarthak.practice1.model;

public class UserReview {

    String reviewId;
    String user;
    int rating;
    String comment;

    @Override
    public String toString() {
        return "UserReview{" +
                "reviewId='" + reviewId + '\'' +
                ", user='" + user + '\'' +

                ", rating=" + rating +
                ", comment='" + comment + '\'' +
                '}';
    }
}
