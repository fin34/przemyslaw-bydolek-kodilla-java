package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;
import static com.kodilla.stream.array.ArrayOperations.getAverage;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        int[] tab = {2, 4, 3, 9, 3, 3, 3};
        double result = getAverage(tab);
        Assert.assertEquals(3.85, result, 0.01);
    }
}
