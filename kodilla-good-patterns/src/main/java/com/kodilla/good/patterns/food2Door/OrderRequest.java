package com.kodilla.good.patterns.food2Door;

public class OrderRequest {

    private Manufacturer manufacturer;
    private String typeProduct;
    private int quantityProduct;

    public OrderRequest(Manufacturer manufacturer, String typeProduct, int quantityProduct) {
        this.manufacturer = manufacturer;
        this.typeProduct = typeProduct;
        this.quantityProduct = quantityProduct;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public String getTypeProduct() {
        return typeProduct;
    }

    public int getQuantityProduct() {
        return quantityProduct;
    }
}