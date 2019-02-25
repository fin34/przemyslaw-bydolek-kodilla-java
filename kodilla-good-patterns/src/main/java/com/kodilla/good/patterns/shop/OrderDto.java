package com.kodilla.good.patterns.shop;

public class OrderDto {

    public User user;
    public boolean orderComplited;

    public OrderDto(User user, boolean orderComplited) {
        this.user = user;
        this.orderComplited = orderComplited;
    }

    public User getUser() {
        return user;
    }
}