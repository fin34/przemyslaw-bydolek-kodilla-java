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
        Pattern pattern = Pattern.compile("[0-99]");
        if (pattern.matcher(idAnswer).matches()) {
            int id = Integer.parseInt(idAnswer);
            if (id < warehouse.getListOfProducts().size()) {
                System.out.println("How many?");
                int quantity = scanner.nextInt();
                if (quantity <= warehouse.getListOfProducts().get(id).getQuantityProduct() && quantity != 0) {
                    listOfProductInCart.add(warehouse.getListOfProducts().get(id).getName() + " Quantity: " + quantity);
                    warehouse.getListOfProducts().get(id).setQuantityProduct(warehouse.getListOfProducts()
                            .get(id).getQuantityProduct() - quantity);
                } else {
                    System.out.println("We do not have that amount");
                }
            }
        } else {
            System.out.println("Incorrect ID");
        }
    }

    @Override
    public String toString() {
        return "Cart{" +
                "listOfProductInCart=" + listOfProductInCart +
                '}';
    }
}