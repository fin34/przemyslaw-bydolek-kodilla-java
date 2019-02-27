package com.kodilla.good.patterns.food2Door;

public class Aplication {

    public static void main(String[] args) {

        ExampleOrder exampleOrder = new ExampleOrder();
        OrderProcessor orderProcessor = new OrderProcessor();

        OrderRepository orderRepository = new OrderRepository();
        orderProcessor.splitOrder(exampleOrder.order());
    }
}