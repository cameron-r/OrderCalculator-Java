package com.orderCalculator.data;

import com.orderCalculator.models.OrderItem;

import java.util.ArrayList;
import java.util.List;

public class OrderItemRepo {

    public List<OrderItem> getOrderItems(String orderNumber) {
        ArrayList<OrderItem> items = new ArrayList<>();

        // hit the database, populate items

        return items;
    }

}
