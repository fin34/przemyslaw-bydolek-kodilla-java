package com.kodilla.good.patterns.shop;

public class Aplication {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Menu menu = new Menu(warehouse);
        menu.printMenu();
    }
}
