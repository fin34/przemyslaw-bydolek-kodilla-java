package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

        ArrayList<Integer> evenNumbers = new ArrayList<>();

        if(!numbers.isEmpty()) {
            for (Integer number : numbers) {
                if (number % 2 == 0) {
                    evenNumbers.add(number);
                    System.out.println("ff");
                    System.out.println("ff");
                }
            }
            return evenNumbers;
        }
        return null;
    }
}
