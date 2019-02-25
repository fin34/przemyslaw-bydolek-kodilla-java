package com.kodilla.good.patterns.shop;

public class Product {

    private String name;
    private int quantityProduct;

    public Product(String name, int quantityProduct) {
        this.name = name;
        this.quantityProduct = quantityProduct;
    }

    public int getQuantityProduct() {
        return quantityProduct;
    }

    public void setQuantityProduct(int quantityProduct) {
        this.quantityProduct = quantityProduct;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "{" +
                "Name = '" + name + '\'' +
                ", Quantity product = " + quantityProduct +
                '}';
    }
}
