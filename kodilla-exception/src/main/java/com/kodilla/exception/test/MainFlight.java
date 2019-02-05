package com.kodilla.exception.test;

public class MainFlight {

    public static void main(String[] args) {

        Flight firstFlight = new Flight("Torino", "Rome");
        FindFilghtLogic searchFilght = new FindFilghtLogic();
        try {
            System.out.println("Connection found? " + searchFilght.findFilght(firstFlight));
        }catch (RouteNotFoundException e) {
            System.out.println("Airport not found");
        }
    }
}
