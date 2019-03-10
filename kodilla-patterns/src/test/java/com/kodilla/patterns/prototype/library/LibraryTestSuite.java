package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {


    @Test
    public void testGetBooks() {

        Library library = new Library("School Library");
        Book book1 = new Book("Czarny", "Adam", LocalDate.of(1990, 12, 30));
        Book book2 = new Book("Biały", "Andrzej", LocalDate.of(1990, 12, 30));
        Book book3 = new Book("Zielony", "Alicja", LocalDate.of(1990, 12, 30));
        Book book4 = new Book("Czerwony", "Ania", LocalDate.of(1990, 12, 30));

        library.books.add(book1);
        library.books.add(book2);
        library.books.add(book3);
        library.books.add(book4);

        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("Public Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library.deepCopy();
            cloneLibrary.setName("Privet Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Assert.assertEquals(4, library.getBooks().size());
        Assert.assertEquals(4, cloneLibrary.getBooks().size());
        Assert.assertEquals(4, deepCloneLibrary.getBooks().size());
    }

}
