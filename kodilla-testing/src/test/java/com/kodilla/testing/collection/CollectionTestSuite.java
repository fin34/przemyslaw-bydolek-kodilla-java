package com.kodilla.testing.collection;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> testArray = new ArrayList<>();
        List<Integer> result = oddNumbersExterminator.exterminate(testArray);
        System.out.println("Testing: " + oddNumbersExterminator.exterminate(testArray));
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> testArray = new ArrayList<>();
        testArray.add(4);
        testArray.add(5);
        testArray.add(8);
        ArrayList<Integer> example = new ArrayList<>();
        example.add(4);
        example.add(8);
        List<Integer> result = oddNumbersExterminator.exterminate(testArray);
        System.out.println("Testing: " + oddNumbersExterminator.exterminate(testArray));
        Assert.assertEquals(example, result);

    }
}
