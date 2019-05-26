package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public abstract class AbstractPizzaDecorator implements Order {
    private final Order order;

    protected AbstractPizzaDecorator(Order order) {
        this.order = order;
    }

    @Override
    public BigDecimal getCost() {
        return order.getCost();
    }

    @Override
    public String getDescription() {
        return order.getDescription();
    }
}
