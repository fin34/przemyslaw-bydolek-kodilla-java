package com.kodilla.good.patterns.shop;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Cart {

    private List<String> listOfProductInCart;
    private Scanner scanner = new Scanner(System.in);

    public Cart(List<String> listOfProduct) {
        this.listOfProductInCart = listOfProduct;
    }

    public List<String> getListOfProductInCart() {
        return listOfProductInCart;
    }

    public void showCart() {
        if (listOfProductInCart.isEmpty()) {
            System.out.println("Cart is empty");
        }
        for (String product : listOfProductInCart) {
            System.out.println(product);
        }
    }

    public void addProductToCart(Warehouse warehouse) {
        System.out.println("What the add, chose ID:");
        warehouse.showProducts();
        String idAnswer = scanner.next();
        try {
            int id = Integer.parseInt(idAnswer);
            readAmountToAddCart(warehouse, id);
        } catch (NumberFormatException e) {
            System.out.println(",,,");
        }
    }

    private void readAmountToAddCart(Warehouse warehouse, int id) {
        if (id < warehouse.getListOfProducts().size()) {
            System.out.println("How many?");
            int quantity = scanner.nextInt();
            Product product = warehouse.getListOfProducts().get(id);
            addToCart(product, quantity);
        }
    }

    private void addToCart(Product product, int quantity) {

        if (quantity <= product.getQuantityProduct() && quantity != 0) {
            listOfProductInCart.add(product.getName() + " Quantity: " + quantity);
            product.setQuantityProduct(product.getQuantityProduct() - quantity);
        } else {
            System.out.println("We do not have that amount");
        }
    }

    @Override
    public String toString() {
        return "Cart{" +
                "listOfProductInCart=" + listOfProductInCart +
                '}';
    }
}