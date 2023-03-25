package com.lhj8390.behavioral.strategy;

public class PhoneStrategy implements Strategy {
    @Override
    public int getPoint(int price) {
        return (int) (price * 0.005);
    }
}
