package com.kodilla.good.patterns.shop;

import java.util.ArrayList;
import java.util.List;

public class ListOfOrder implements OrderRepository {

    private List<String> allOrders = new ArrayList<>();

    public void createOrder(OrderRequest orderRequest) {
        allOrders.add(orderRequest.getUser().toString() + " " + orderRequest.getCart().toString());
    }

    public void getAllOrders() {
        if(!allOrders.isEmpty()) {
            for (String x : allOrders) {
                System.out.println(x);
            }
        }else {
            System.out.println("List of orders is empty");
        }
    }
}
