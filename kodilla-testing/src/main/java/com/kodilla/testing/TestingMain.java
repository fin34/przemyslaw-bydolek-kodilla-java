package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if(result.equals("theForumUser")){
            System.out.println("Test Ok");
        } else {
            System.out.println("Error!");
        }

        int a = 4;
        int b = 3;
        int resultAdd = a+b;
        int resultSubtract = a-b;

        Calculator calculator = new Calculator();

        if(calculator.add(a, b)==resultAdd){
            System.out.println("Test Ok");
        } else {
            System.out.println("Error!");
        }

        if(calculator.subtract(a, b)==resultSubtract){
            System.out.println("Test Ok");
        } else {
            System.out.println("Error!");
        }
    }
}
