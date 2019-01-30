package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        //Zadanie 7.1
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Domek", word -> "ABC**" + word + "**ABC");
        poemBeautifier.beautify("Domek", word -> word.toUpperCase());
        poemBeautifier.beautify("Domek", word -> word.toLowerCase());
        poemBeautifier.beautify("aabbaabbaa", word -> word.replace("a", "A"));

        System.out.println();

        //Zadanie 7.3
        Forum forum = new Forum();
        LocalDate a = LocalDate.of(1998, 1, 26);

        Map<Integer, ForumUser> mapOfUsers = forum.getListOfUser().stream()
                .filter(forumUser -> forumUser.getSex()=='M')
                .filter(forumUser -> forumUser.getDateOfBirth().isBefore(a))
                .filter(forumUser -> forumUser.getNumberOfPost()>0)
                .collect(Collectors.toMap(ForumUser::getIdUser, forumUser -> forumUser));

        mapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}