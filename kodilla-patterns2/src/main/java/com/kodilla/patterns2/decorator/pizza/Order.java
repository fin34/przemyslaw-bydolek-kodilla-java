package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public interface Order {
    BigDecimal getCost();
    String getDescription();
}
