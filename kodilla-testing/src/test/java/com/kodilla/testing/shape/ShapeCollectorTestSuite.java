package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

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
    public void testAddFigure(){
        Square square = new Square(5.0);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(square);
        Assert.assertEquals(1, shapeCollector.getQuantityShapes());
    }

    @Test
    public void testRemoveFigure(){
        Square square = new Square(5.0);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(square);

        boolean result = shapeCollector.removeFigure(square);
        Assert.assertFalse(result);
    }

    @Test
    public void testGetFigure(){
        Square square = new Square(5.0);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(square);

        Shape shape;
        shape = shapeCollector.getFigure(0);
        Assert.assertEquals(square, shape);
    }

    @Test
    public void testShowFigures(){
        Square square = new Square(5.0);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(square);

        Shape shape;
        shape = shapeCollector.showFigures();
        Assert.assertEquals(square, shape);



    }



}
