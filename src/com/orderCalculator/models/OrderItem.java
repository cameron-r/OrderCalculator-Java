package com.orderCalculator.models;

public class OrderItem {
    public enum ItemType {
        NORMAL, FOOD, BOOK
    }
    public final ItemType type;
    public final double unitPrice;

    public OrderItem(ItemType type, double unitPrice) {
        this.type = type;
        this.unitPrice = unitPrice;
    }
}
