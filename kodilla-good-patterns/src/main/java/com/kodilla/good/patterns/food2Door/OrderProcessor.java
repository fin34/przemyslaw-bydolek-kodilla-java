package com.kodilla.good.patterns.food2Door;

public class OrderProcessor {

    private int counter;
    private OrderRepository orderRepository = new OrderRepository();

    public void splitOrder(OrderRequest orderRequest){

        Manufacturer manufacturer = orderRequest.getManufacturer();
        orderRepository.addOrder(new OrderDto(manufacturer.process(orderRequest), counter++));
    }
}