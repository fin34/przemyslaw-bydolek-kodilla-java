package com.kodilla.good.patterns.food2Door;

public class GlutenFreeShop implements Manufacturer{

    public boolean process(OrderRequest order){
        order.getQuantityProduct();
        order.getTypeProduct();
        System.out.println("Forward to completion");
        return true;
    }
}