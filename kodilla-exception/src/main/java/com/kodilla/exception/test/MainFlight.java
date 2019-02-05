package com.kodilla.exception.test;

public class MainFlight {

    public static void main(String[] args) {

        Flight firstFlight = new Flight("Torino", "Rome");
        FindFilghtLogic findFilght = new FindFilghtLogic();
        try {
            System.out.println("Connection found? " + findFilght.findFilght(firstFlight));
        }catch (RouteNotFoundException e) {
            System.out.println("Airport not found");
        }
    }
}
