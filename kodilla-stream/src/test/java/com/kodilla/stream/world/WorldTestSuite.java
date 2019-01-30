package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {

        Country country1 = new Country("Polska", new BigDecimal("4000000000000000000000"));
        Country country2 = new Country("Anglia", new BigDecimal("4000000000000000000000"));
        Country country3 = new Country("RPA", new BigDecimal("4000000000000000000000"));
        Country country4 = new Country("Iran", new BigDecimal("4000000000000000000000"));
        Country country5 = new Country("USA", new BigDecimal("4000000000000000000000"));
        Country country6 = new Country("Włochy", new BigDecimal("4000000000005000000000"));
        List<Country> continent1 = new ArrayList<>();
        continent1.add(country1);
        continent1.add(country2);
        continent1.add(country3);
        List<Country> continent2 = new ArrayList<>();
        continent2.add(country4);
        continent2.add(country5);
        continent2.add(country6);
        Continent continent = new Continent("Europa", continent1);
        Continent continent3 = new Continent("Afryka", continent2);
        List<Continent> listOfContinents = new ArrayList<>();
        listOfContinents.add(continent);
        listOfContinents.add(continent3);
        World world = new World(listOfContinents);

        BigDecimal result = world.getPeopleQuantity();
        BigDecimal expectedResult = new BigDecimal("24000000000005000000000");

        System.out.println(result);
        Assert.assertEquals(expectedResult, result);
    }
}
