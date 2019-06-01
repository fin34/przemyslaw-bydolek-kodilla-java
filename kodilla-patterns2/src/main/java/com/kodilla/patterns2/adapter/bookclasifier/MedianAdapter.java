package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.OldBook;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<OldBook> oldBookSet) {
        Map<BookSignature, Book> mapBooks = new HashMap<>();
        mapBooks = oldBookSet.stream()
                .collect(Collectors.toMap(x -> new BookSignature(),
                        new Book()));

//        Map<BookSignature, Book> mapBooks = new HashMap<>();
//        for (OldBook oldBook : oldBookSet) {
//            mapBooks.put(new BookSignature(oldBook.getSignature()),
//                    new Book(oldBook.getAuthor(), oldBook.getTitle(), oldBook.getPublicationYear()));
//        }
        return medianPublicationYear(mapBooks);
    }
}
