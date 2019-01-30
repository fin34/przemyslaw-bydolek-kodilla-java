package com.kodilla.stream.world;

import java.util.List;

public final class Continent {

    private final String continentName;
    private final List<Country> listOfCountry;

    public Continent(String continentName, List<Country> listOfCountry) {
        this.continentName = continentName;
        this.listOfCountry = listOfCountry;
    }

    public List<Country> getListOfCountry() {
        return listOfCountry;
    }
}
