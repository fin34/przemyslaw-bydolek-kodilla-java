package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    private Display display;

    public double add(double a, double b) {
        double sum = a+b;
        display.displayValue(sum);
        return sum;
    }

    public double sub(double a, double b) {
        double subtract = a-b;
        display.displayValue(subtract);
        return subtract;
    }

    public double mul(double a, double b) {
        double multiply = a*b;
        display.displayValue(multiply);
        return multiply;
    }

    public double div(double a, double b) {
        double divide = a/b;
        display.displayValue(divide);
        return divide;
    }
}
