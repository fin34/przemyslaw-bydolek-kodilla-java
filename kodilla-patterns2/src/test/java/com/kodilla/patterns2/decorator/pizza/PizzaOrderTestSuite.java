package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.logging.SocketHandler;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testOrderPizzaGetCost() {
        //Given
        Order firstOrder = new BasicPizza();
        Order secondOrder = new BasicPizza();
        Order thirdOrder = new BasicPizza();
        firstOrder = new Cheese(firstOrder);
        firstOrder = new Ham(firstOrder);
        firstOrder = new Mushrooms(firstOrder);
        firstOrder = new Tuna(firstOrder);
        secondOrder = new Ham(secondOrder);
        secondOrder = new Mushrooms(secondOrder);
        System.out.println("Cost of first order: " + firstOrder.getCost());
        System.out.println("Cost of second order: " + secondOrder.getCost());
        System.out.println("Cost of third order: " + thirdOrder.getCost());
        //When
        BigDecimal costFirstOrder = firstOrder.getCost();
        BigDecimal costSecondOrder = secondOrder.getCost();
        BigDecimal costThirdOrder = thirdOrder.getCost();
        //Then
        assertEquals(new BigDecimal(35), costFirstOrder);
        assertEquals(new BigDecimal(25), costSecondOrder);
        assertEquals(new BigDecimal(15), costThirdOrder);
    }

    @Test
    public void testOrderPizzaGetDescription() {
        //Given
        Order firstOrder = new BasicPizza();
        Order secondOrder = new BasicPizza();
        Order thirdOrder = new BasicPizza();
        firstOrder = new Cheese(firstOrder);
        firstOrder = new Ham(firstOrder);
        firstOrder = new Mushrooms(firstOrder);
        firstOrder = new Tuna(firstOrder);
        secondOrder = new Ham(secondOrder);
        secondOrder = new Mushrooms(secondOrder);
        System.out.println("First order: " + firstOrder.getDescription());
        System.out.println("Second order: " + secondOrder.getDescription());
        System.out.println("Third order: " + thirdOrder.getDescription());
        //When
        String descriptionFirstOrder = firstOrder.getDescription();
        String descriptionSecondOrder = secondOrder.getDescription();
        String descriptionThirdOrder = thirdOrder.getDescription();
        //Then
        assertEquals("Margherita + cheese + ham + mushrooms + tuna", descriptionFirstOrder);
        assertEquals("Margherita + ham + mushrooms", descriptionSecondOrder);
        assertEquals("Margherita", descriptionThirdOrder);
    }
}
