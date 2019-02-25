package com.kodilla.good.patterns.shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Warehouse {

    private Scanner scanner = new Scanner(System.in);
    private List<Product> listOfProducts;

    public Warehouse() {
        Product product1 = new Product("TV LG", 3);
        Product product2 = new Product("TV Sony", 5);
        Product product3 = new Product("TV Philips", 12);
        Product product4 = new Product("TV Samsung", 20);
        listOfProducts = new ArrayList<>();
        listOfProducts.add(product1);
        listOfProducts.add(product2);
        listOfProducts.add(product3);
        listOfProducts.add(product4);
    }

    public List<Product> getListOfProducts() {
        return listOfProducts;
    }

    public void addProduct() {
        System.out.println("Name of the item:");
        String name = scanner.next();
        System.out.println("Quantity:");
        int quantity = scanner.nextInt();
        Product product = new Product(name, quantity);
        listOfProducts.add(product);
    }

    public void showProducts(){
        for (int i = 0; i <listOfProducts.size() ; i++) {
            System.out.println(listOfProducts.get(i) + " ID: " + i);
        }
    }
}