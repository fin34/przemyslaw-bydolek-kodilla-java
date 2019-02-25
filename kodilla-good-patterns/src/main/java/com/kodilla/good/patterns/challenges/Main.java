package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        MovieStore films = new MovieStore();

        String allFilms = films.getMovies().entrySet().stream()
                .flatMap(x -> x.getValue().stream())
                .collect(Collectors.joining(" ! ", "", ""));

        System.out.println(allFilms);
    }
}
