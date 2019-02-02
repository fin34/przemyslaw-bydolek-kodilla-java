package com.kodilla.stream.array;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers){

        if(numbers.length>0) {
            System.out.println("Elementy tablicy:");
            IntStream getNumbers = IntStream.range(0, numbers.length).map(x -> numbers[x]);
            getNumbers.forEach(System.out::println);

            double getAverage = IntStream.range(0, numbers.length).map(x -> numbers[x]).average().getAsDouble();
            return getAverage;
        }
        return 0;
    }
}
