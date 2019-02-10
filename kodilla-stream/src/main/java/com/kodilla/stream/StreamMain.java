package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

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

        Map<Integer, ForumUser> mapOfUsers = forum.getListOfUser().stream()
                .filter(forumUser -> forumUser.getSex()=='M')
                .filter(forumUser -> forumUser.getDateOfBirth().plusYears(20).isBefore(LocalDate.now()))
                .filter(forumUser -> forumUser.getNumberOfPost()>0)
                .collect(Collectors.toMap(ForumUser::getIdUser, forumUser -> forumUser));

        mapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);


//        System.gc();
//
//        Double d = 1.1d;
//        Integer i = 0735;
//        d = i + d;
//        System.out.print(d);
//
//
//
//        String a = new String("abc");
//        a = a.intern();
//        String b = "abc";
//
//        System.out.println(a==b);
//        System.out.println(a.equals(b));
//
//        Integer ab = 1200;
//        Integer ba = 1200;
//
//        System.out.println(ab==ba);
//        System.out.println(ab.equals(ba));
//
//        Ba baa = new Ba();
    }
}