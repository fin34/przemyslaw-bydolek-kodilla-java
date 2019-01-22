package com.kodilla.testing.shape;

public class Square implements Shape {

    private final String name = "Square";
    private double sideLenght;

    public Square(double sideLenght) {
        this.sideLenght = sideLenght;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        double field = sideLenght*sideLenght;
        return field;
    }

    @Override
    public String toString() {
        return name  +
                ", side lenght=" + sideLenght +
                "\n";
    }
}
