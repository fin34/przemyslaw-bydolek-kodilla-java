package com.kodilla.good.patterns.food2Door;

public class HealthyShop implements Manufacturer {

    public boolean process(OrderRequest order){
        order.getQuantityProduct();
        order.getTypeProduct();
        System.out.println("Sent sms");
        return true;
    }
}