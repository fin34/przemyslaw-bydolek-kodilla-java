package com.kodilla.patterns2.adapter.bookclasifier.libraryb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Statistics implements BookStatistics {
    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {
        if(books.size() == 0) return 0;
        int sum = 0;
        for(Map.Entry<BookSignature, Book> entry : books.entrySet()) {
            sum += entry.getValue().getYearOfPublication();
        }
        return sum/books.size();
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books) {
        if(books.isEmpty()) return 0;

        List<Integer> publicationYears = books.entrySet().stream()
                .map(x -> x.getValue().getYearOfPublication())
                .sorted()
                .collect(Collectors.toList());
        int middleIndex = publicationYears.size() / 2;
        if(publicationYears.size() % 2 == 0) {
            return (publicationYears.get(middleIndex) + publicationYears.get(middleIndex - 1))/2;
        } else {
            return publicationYears.get(middleIndex);
        }
    }


}
