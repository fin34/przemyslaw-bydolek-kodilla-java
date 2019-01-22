package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private Shape shape;
    private ArrayList<Shape> listOfFigures = new ArrayList<>();

    public void addFigure(Shape shape){
        listOfFigures.add(shape);
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (listOfFigures.contains(shape)){
            listOfFigures.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        return listOfFigures.get(n);
    }

    public String showFigures() {
        String showFigures= "";
        for (Shape shape:listOfFigures) {
            showFigures += shape.toString();
        }
        return showFigures;
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
