package com.kodilla.good.patterns.shop;

public class ProductOrderService implements ShoppingService{

    public boolean order (final User user, final Cart cart) {
        if(!cart.getListOfProductInCart().isEmpty()) {
            System.out.println("Order for: " + user.getName() + " " + user.getSurname()
                    + " " + cart.getListOfProductInCart().toString());
            System.out.println("Order to execute");
            return true;
        }else {
            System.out.println("Cart is empty!!!");
            return false;
        }
    }
}