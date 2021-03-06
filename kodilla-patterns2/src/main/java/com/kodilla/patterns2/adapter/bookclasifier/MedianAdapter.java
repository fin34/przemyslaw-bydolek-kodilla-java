package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.OldBook;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<OldBook> oldBookSet) {
        Map<BookSignature, Book> mapBooks = oldBookSet.stream()
                .collect(Collectors.toMap(oldBook -> new BookSignature(oldBook.getSignature()), oldBook->
                        new Book(oldBook.getAuthor(), oldBook.getTitle(), oldBook.getPublicationYear())));
        return medianPublicationYear(mapBooks);
    }
}
