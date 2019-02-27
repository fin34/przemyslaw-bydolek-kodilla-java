package com.kodilla.good.patterns.food2Door;

public class ExampleOrder {

    public OrderRequest order(){

        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        return new OrderRequest(extraFoodShop, "Tomatos", 34);
    }
}