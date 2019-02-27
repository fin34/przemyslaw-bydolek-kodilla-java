package com.kodilla.good.patterns.food2Door;

public class OrderDto {

    private boolean isComplited;
    private int numbOfOrder;

    public OrderDto(boolean isComplited, int numbOfOrder) {
        this.isComplited = isComplited;
        this.numbOfOrder = numbOfOrder;
    }

    public boolean isComplited() {
        return isComplited;
    }

    public int getNumbOfOrder() {
        return numbOfOrder;
    }
}