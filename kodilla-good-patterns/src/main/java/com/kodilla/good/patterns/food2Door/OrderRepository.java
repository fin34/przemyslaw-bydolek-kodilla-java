package com.kodilla.good.patterns.food2Door;

import java.util.ArrayList;
import java.util.List;

public class OrderRepository {

    private List<OrderDto> listOfOrder = new ArrayList<>();

    public void addOrder(OrderDto orderDto) {
        listOfOrder.add(orderDto);
    }
}