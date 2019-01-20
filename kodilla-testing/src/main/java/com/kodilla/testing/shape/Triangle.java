package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private final String name = "Triangle";
    private double lenghtSideTriangle;
    private double lenghtHeightLoweredToTheSide;

    public Triangle(double lenghtSideTriangle, double lenghtHeightLoweredToTheSide) {
        this.lenghtSideTriangle = lenghtSideTriangle;
        this.lenghtHeightLoweredToTheSide = lenghtHeightLoweredToTheSide;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        double field = (lenghtSideTriangle*lenghtHeightLoweredToTheSide)/2;
        return field;
    }
}
