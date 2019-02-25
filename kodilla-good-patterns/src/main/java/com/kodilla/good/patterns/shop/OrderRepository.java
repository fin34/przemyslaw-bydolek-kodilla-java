package com.kodilla.good.patterns.shop;

public interface OrderRepository {
    void createOrder(OrderRequest orderRequest);
}