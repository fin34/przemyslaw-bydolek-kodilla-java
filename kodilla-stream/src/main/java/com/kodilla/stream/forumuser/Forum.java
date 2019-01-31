package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> listOfUser = new ArrayList<>();

    public Forum() {

        listOfUser.add(new ForumUser(1, "Andrzej", 'M', 1996, 12, 30, 5));
        listOfUser.add(new ForumUser(2, "Adam", 'M', 1998, 11, 20, 0));
        listOfUser.add(new ForumUser(3, "Alex", 'M', 1997, 12, 10, 4));
        listOfUser.add(new ForumUser(4, "Ania", 'F', 2002, 10, 20, 2));
        listOfUser.add(new ForumUser(5, "Alina", 'F', 1990, 10, 30, 0));
        listOfUser.add(new ForumUser(6, "Alicja", 'M', 2000, 1, 30, 5));
    }

    public List<ForumUser> getListOfUser() {
        return new ArrayList<>(listOfUser);
    }
}
