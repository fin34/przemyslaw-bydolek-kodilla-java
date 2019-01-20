package com.kodilla.testing.shape;

public class Program {

    public static void main(String[] args) {


        Square square = new Square(5.0);
        Square square1 = new Square(3.0);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(square1);


        System.out.println(square.equals(shapeCollector.getFigure(0)));

        System.out.println(shapeCollector.getFigure(1));
        System.out.println(shapeCollector.getQuantityShapes());
    }
}
