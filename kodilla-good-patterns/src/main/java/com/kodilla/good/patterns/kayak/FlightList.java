package com.kodilla.good.patterns.kayak;

import java.util.*;

public class FlightList {

    private Map<String, Set<String>> mapOfFlight = new HashMap<>();

    public FlightList() {
        Set<String> flightsFromPoznan = new HashSet<>();
        flightsFromPoznan.add("Wrocław");
        flightsFromPoznan.add("Kraków");
        flightsFromPoznan.add("Gdańsk");
        flightsFromPoznan.add("Warszawa");
        Set<String> flightsFromWarsaw = new HashSet<>();
        flightsFromWarsaw.add("Police");
        flightsFromWarsaw.add("Szczecin");
        flightsFromWarsaw.add("Kraków");
        flightsFromWarsaw.add("Wrocław");
        Set<String> flightsFromGdansk = new HashSet<>();
        flightsFromGdansk.add("Poznań");
        flightsFromGdansk.add("Kraków");
        flightsFromGdansk.add("Warszawa");
        flightsFromGdansk.add("Szczecin");
        Set<String> flightsFromKatowice = new HashSet<>();
        flightsFromKatowice.add("Warszawa");
        flightsFromKatowice.add("Poznań");

        mapOfFlight.put("Poznań", flightsFromPoznan);
        mapOfFlight.put("Warszawa", flightsFromWarsaw);
        mapOfFlight.put("Gdańsk", flightsFromGdansk);
        mapOfFlight.put("Katowice", flightsFromKatowice);
    }

    public Map<String, Set<String>> getMapOfFlight() {
        return mapOfFlight;
    }
}
