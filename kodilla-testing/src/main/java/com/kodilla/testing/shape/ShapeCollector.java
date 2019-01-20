package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private Shape shape;
    private ArrayList<Shape> listOfFigures = new ArrayList<>();

    public void addFigure(Shape shape){

        listOfFigures.add(shape);
    }

    public boolean removeFigure(Shape shape){

        return false;
    }

    public Shape getFigure(int n) {

        return listOfFigures.get(n);

    }

    public Shape showFigures() {

        return shape;
    }

    public int getQuantityShapes(){
        return listOfFigures.size();
    }

    @Override
    public String toString() {
        return "ShapeCollector{" +
                "shape=" + shape +
                ", listOfFigures=" + listOfFigures +
                '}';
    }
}
