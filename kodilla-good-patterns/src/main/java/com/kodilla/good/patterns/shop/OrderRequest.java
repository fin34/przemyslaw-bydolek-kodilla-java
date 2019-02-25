package com.kodilla.good.patterns.shop;

public class OrderRequest {

    private User user;
    private Cart cart;

    public OrderRequest(User user, Cart cart) {
        this.user = user;
        this.cart = cart;
    }

    public User getUser() {
        return user;
    }

    public Cart getCart() {
        return cart;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "user=" + user +
                ", cart=" + cart +
                '}';
    }
}