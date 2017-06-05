package com.orderCalculator.exceptions;

public class NoItemsPassedInException extends RuntimeException {
    public NoItemsPassedInException(String msg) {
        super(msg);
    }
}
