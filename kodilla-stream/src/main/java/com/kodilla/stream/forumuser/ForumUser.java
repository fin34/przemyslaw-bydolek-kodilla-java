package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int idUser;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int numberOfPost;

    public ForumUser(int idUser, String userName, char sex, int yearOfBirth, int monthOfBirth, int dayOfBirth, int numberOfPost) {
        this.idUser = idUser;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.numberOfPost = numberOfPost;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPost() {
        return numberOfPost;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "idUser=" + idUser +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOfPost=" + numberOfPost +
                '}';
    }
}
