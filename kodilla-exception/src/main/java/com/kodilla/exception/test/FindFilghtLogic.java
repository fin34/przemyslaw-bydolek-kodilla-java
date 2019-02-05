package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFilghtLogic {

    public Boolean findFilght(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightsMap = new HashMap<>();
        flightsMap.put("Barcelona", true);
        flightsMap.put("Rome", false);
        if(!flightsMap.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException();
        }else {
            return flightsMap.get(flight.getArrivalAirport());
        }

    }
}
