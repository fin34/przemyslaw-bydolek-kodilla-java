package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;

public final class World {

    private final List<Continent> listOfContinent;

    public World(List<Continent> listOfContinent) {
        this.listOfContinent = listOfContinent;
    }

    public BigDecimal getPeopleQuantity(){

        return listOfContinent.stream()
                .flatMap(country -> country.getListOfCountry().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
