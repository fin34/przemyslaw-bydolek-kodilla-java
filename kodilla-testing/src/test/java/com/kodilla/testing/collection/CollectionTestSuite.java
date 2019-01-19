package com.kodilla.testing.collection;
import org.junit.*;
import java.util.ArrayList;

public class CollectionTestSuite {

//    public static void main(String[] args) {
//
//        ArrayList<Integer> example = new ArrayList<>();
//
//        example.add(4);
//        example.add(5);
//
//        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
//
//      //  oddNumbersExterminator.exterminate(example);
//
//        System.out.println(oddNumbersExterminator.exterminate(example));
//    }

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
        ArrayList<Integer> testArray = new ArrayList<>();
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(testArray);
        System.out.println("Testing: " + oddNumbersExterminator.exterminate(testArray));
        Assert.assertNull(result);
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
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(testArray);
        System.out.println("Testing: " + oddNumbersExterminator.exterminate(testArray));
        Assert.assertEquals(example, result);

    }
}
