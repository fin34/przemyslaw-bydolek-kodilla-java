package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class Tuna extends AbstractPizzaDecorator {
    public Tuna(Order order) {
        super(order);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + tuna";
    }
}
