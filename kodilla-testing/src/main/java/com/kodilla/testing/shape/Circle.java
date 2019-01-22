package com.kodilla.testing.shape;

public class Circle implements Shape {

    private final String name = "Circle";
    private double wheelRadius;

    public Circle(double wheelRadius) {
        this.wheelRadius = wheelRadius;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        double field = Math.PI *(wheelRadius*wheelRadius);
        return field;
    }

    @Override
    public String toString() {
        return name  +
                ", wheel radius=" + wheelRadius +
                "\n";
    }
}
