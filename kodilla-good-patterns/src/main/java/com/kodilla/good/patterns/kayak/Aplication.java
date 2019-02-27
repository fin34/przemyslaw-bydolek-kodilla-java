package com.kodilla.good.patterns.kayak;

public class Aplication {

    public static void main(String[] args) {

        FlightList flightList = new FlightList();
        FlightSearch flightSearch = new FlightSearch(flightList);
        flightSearch.allFlightsFromCity("Poznań");
        System.out.println();
        flightSearch.directAllFlightsToCity("Warszawa");
        System.out.println();
        flightSearch.allFlightsToCity("Warszawa");
    }
}
