package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFilghtLogic {

    public Boolean findFilght(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Barcelona", true);
        flightMap.put("Rome", false);
        if(!flightMap.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException();
        }else {
            return flightMap.get(flight.getArrivalAirport());
        }

    }
}
