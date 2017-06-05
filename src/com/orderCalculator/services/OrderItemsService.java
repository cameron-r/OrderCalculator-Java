package com.orderCalculator.services;

import com.orderCalculator.data.OrderItemRepo;
import com.orderCalculator.data.OrderRepo;

public class OrderItemsService {

    private final OrderItemRepo orderItemRepo;
    private final OrderRepo orderRepo;

    public OrderItemsService(OrderItemRepo orderItemRepo, OrderRepo orderRepo) {
        this.orderItemRepo = orderItemRepo;
        this.orderRepo = orderRepo;
    }

    public void processOrderTax(String orderNumber) {
    }
}
