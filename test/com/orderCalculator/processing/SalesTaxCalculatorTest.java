package com.orderCalculator.processing;

import com.orderCalculator.exceptions.NoItemsPassedInException;
import com.orderCalculator.models.OrderItem;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SalesTaxCalculatorTest {

    private SalesTaxCalculator salesTaxCalculator;

    @Before
    public void setUp() throws Exception {
        salesTaxCalculator = new SalesTaxCalculator();
    }

    @Test
    public void shouldCalculateTenPercentTaxForNormalItems() {

        List<OrderItem> itemList = new ArrayList<>();
        itemList.add(new OrderItem(OrderItem.ItemType.NORMAL, 12.00));
        double tax = salesTaxCalculator.calculateTax(itemList);

        assertEquals(tax, 1.2, 0.0001);
    }

    @Test
    public void shouldCalculateTenPercentTaxForListNormalItems() {

        List<OrderItem> itemList = new ArrayList<>();
        itemList.add(new OrderItem(OrderItem.ItemType.NORMAL, 12.00));
        itemList.add(new OrderItem(OrderItem.ItemType.NORMAL, 14.00));
        double tax = salesTaxCalculator.calculateTax(itemList);
        assertEquals(tax, 2.6, 0.0001);
    }

    @Test
    public void shouldCalculateFivePercentTaxForBooks() {
        List<OrderItem> itemList = new ArrayList<>();
        itemList.add(new OrderItem(OrderItem.ItemType.BOOK, 20.0));
        double tax = salesTaxCalculator.calculateTax(itemList);
        assertEquals(tax, 1, 0.0001);
    }

    @Test
    public void shouldCalculateTaxOfZeroForFood() {
        List<OrderItem> itemList = new ArrayList<>();
        itemList.add(new OrderItem(OrderItem.ItemType.FOOD, 100.0));

        double tax = salesTaxCalculator.calculateTax(itemList);

        assertEquals(0, tax, 0.0001);
    }

    @Test
    public void shouldCalculateTaxForMixedItems() {
        List<OrderItem> itemList = new ArrayList<>();
        itemList.add(new OrderItem(OrderItem.ItemType.NORMAL, 100.0));
        itemList.add(new OrderItem(OrderItem.ItemType.BOOK, 100.0));
        itemList.add(new OrderItem(OrderItem.ItemType.FOOD, 100.0));

        double tax = salesTaxCalculator.calculateTax(itemList);

        assertEquals(15, tax, 0.0001);
    }

    @Test(expected = NoItemsPassedInException.class)
    public void shouldThrowExceptionWhenNoItemsPassed() {
        List<OrderItem> itemList = new ArrayList<>();

        salesTaxCalculator.calculateTax(itemList);
    }
}