package com.kodilla.good.patterns.food2Door;

public class ExtraFoodShop implements Manufacturer{

    public boolean process(OrderRequest order){
        order.getQuantityProduct();
        order.getTypeProduct();
        return true;
    }
}