package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.OldBook;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<OldBook> oldBookSet = new HashSet<>();
        oldBookSet.add(new OldBook("Stephen King", "Oczy smoka", 1990, "First book"));
        oldBookSet.add(new OldBook("Stephen King", "Zielona mila", 1989, "Second book"));
        oldBookSet.add(new OldBook("Stephen King", "Bastion", 1980, "Third book"));
        oldBookSet.add(new OldBook("Stephen King", "Lśnienie", 1984, "Third book"));
        //When
        int result = medianAdapter.publicationYearMedian(oldBookSet);
        //Then
        assertEquals(1986, result);
    }
}
