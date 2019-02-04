package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {


        System.out.println("Elementy tablicy:");
        IntStream getNumbers = java.util.Arrays.stream(numbers, 0, numbers.length);
        getNumbers.forEach(System.out::println);

        return IntStream.range(0, numbers.length).map(x -> numbers[x]).average().orElse(0);
//        if (getAverage.isPresent()){
//            return getAverage.getAsDouble();
//        }
//        return 0;

    }
}
