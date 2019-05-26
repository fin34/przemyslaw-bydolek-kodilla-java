package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testOrderPizzaGetCost() {
        //Given
        Order order = new BasicPizza();
        order = new Cheese(order);
        order = new Ham(order);
        order = new Mushrooms(order);
        order = new Tuna(order);
        System.out.println(order.getCost());
        //When
        BigDecimal theCost = order.getCost();
        //Then
        assertEquals(new BigDecimal(35), theCost);
    }

    @Test
    public void testOrderPizzaGetDescription() {
        //Given
        Order order = new BasicPizza();
        order = new Cheese(order);
        order = new Ham(order);
        order = new Mushrooms(order);
        order = new Tuna(order);
        System.out.println(order.getDescription());
        //When
        String description = order.getDescription();
        //Then
        assertEquals("Margherita + cheese + ham + mushrooms + tuna", description);
    }
}
