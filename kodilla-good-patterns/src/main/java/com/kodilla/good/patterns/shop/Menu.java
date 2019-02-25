package com.kodilla.good.patterns.shop;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private Scanner scanner = new Scanner(System.in);
    private Warehouse warehouse;
    private Cart cart = new Cart(new ArrayList<>());
    private User user = new User();
    private ListOfOrder listOfOrder = new ListOfOrder();

    public Menu(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void printMenu() {
        System.out.println("Welcome in the online store");
        System.out.println("Your name?");
        user.setName(scanner.next());
        System.out.println("Your surname?");
        user.setSurname(scanner.next());
        String answer;
        do {
            System.out.println("Your chose");
            System.out.println("1 - show all products");
            System.out.println("2 - add to cart");
            System.out.println("3 - show the cart");
            System.out.println("4 - add product to warehouse");
            System.out.println("5 - complete the order");
            System.out.println("6 - all orders");
            System.out.println("7 - end of shopping");
            answer = scanner.next();
            validateAnswer(answer);
        }while (!answer.equalsIgnoreCase("7") );
    }

    public void validateAnswer(String answer){

        switch (answer){
            case "1": {
                warehouse.showProducts();
                break;
            }
            case "2": {
                cart.addProductToCart(warehouse);
                break;
            }
            case "3": {
                cart.showCart();
                break;
            }
            case  "4": {
                warehouse.addProduct();
                break;
            }
            case "5": {
                OrderProcessor orderProcessor = new OrderProcessor(new Information(), new ProductOrderService(), listOfOrder);
                orderProcessor.process(new OrderRequest(user, cart));
                break;
            }
            case "6": {
                listOfOrder.getAllOrders();
                break;
            }
            case "7": {
                System.out.println("Good bye!!!");
                break;
            }
        }
    }
}