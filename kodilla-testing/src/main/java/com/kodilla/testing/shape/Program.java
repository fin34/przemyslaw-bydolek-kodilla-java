package com.kodilla.testing.shape;

public class Program {

    public static void main(String[] args) {


        Square square = new Square(5.0);
        Square square1 = new Square(3.0);
        Circle circle = new Circle(3.4);
        Triangle triangle = new Triangle(3.5, 4.2);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(square1);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);

        shapeCollector.removeFigure(square);

        System.out.println(shapeCollector.showFigures());
        System.out.println(triangle.getField());


//        System.out.println(square.equals(shapeCollector.getFigure(0)));
//
//        System.out.println(shapeCollector.getFigure(1));
//        System.out.println(shapeCollector.getQuantityShapes());
    }
}
