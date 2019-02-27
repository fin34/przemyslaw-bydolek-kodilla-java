package com.kodilla.good.patterns.kayak;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightSearch {

    private FlightList flightList;

    public FlightSearch(FlightList flightList) {
        this.flightList = flightList;
    }

    public void allFlightsFromCity(String city) {

        System.out.println("Miasta do których polecimy z miasta:  " + city);
        flightList.getMapOfFlight().entrySet().stream()
                .filter(x -> x.getKey().equalsIgnoreCase(city))
                .map(y -> y.getValue().toString())
                .forEach(System.out::println);
    }

    public void directAllFlightsToCity(String city) {

        System.out.println("Miasta z których polecimy do miasta: " + city);
        for (Map.Entry<String, Set<String>> entry : flightList.getMapOfFlight().entrySet()) {
            String result = entry.getValue().stream()
                    .filter(x -> x.equalsIgnoreCase(city))
                    .collect(Collectors.joining());
            if (result.equalsIgnoreCase(city)) {
                System.out.println(entry.getKey());
            }
        }
    }

    public void allFlightsToCity(String city) {
        List<String> cityFly = new ArrayList<>();
        for (Map.Entry<String, Set<String>> entry : flightList.getMapOfFlight().entrySet()) {
           String result = entry.getValue().stream()
                    .filter(x -> x.equalsIgnoreCase(city))
                    .collect(Collectors.joining());
            if (result.equalsIgnoreCase(city)){
                cityFly.add(entry.getKey());
            }
        }

        for (int i = 0; i < cityFly.size() ; i++) {
            for (int j = 0; j < cityFly.size() ; j++) {
                String first = cityFly.get(i);
                String second = cityFly.get(j);
                if(flightList.getMapOfFlight().get(second).contains(first)){
                    System.out.println("lot pośredni do " + city + ": " + first + " " + second + " " + city);
                }
            }
        }
    }
}
