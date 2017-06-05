package com.orderCalculator.processing;

import com.orderCalculator.exceptions.NoItemsPassedInException;
import com.orderCalculator.models.OrderItem;

import java.util.List;


public class SalesTaxCalculator {

    public double calculateTax(List<OrderItem> itemList) {
        if (itemList.isEmpty()) {
            throw new NoItemsPassedInException("No items passed into calculate tax for!");
        }
        double totalTax = 0;

        for (OrderItem item: itemList) {
            double tax = 0;
            if (item.type == OrderItem.ItemType.NORMAL) {
                tax = 0.1;
            } else if (item.type == OrderItem.ItemType.BOOK) {
                tax = 0.05;
            }
            totalTax += tax * item.unitPrice;
        }
        return totalTax;
    }
}
