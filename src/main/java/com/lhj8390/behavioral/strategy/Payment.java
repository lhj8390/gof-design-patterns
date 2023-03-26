package com.lhj8390.behavioral.strategy;

public class Payment {
    private final int price;
    private final Strategy strategy;

    public Payment(Strategy strategy, int price) {
        this.strategy = strategy;
        this.price = price;
    }

    public void getPoint() {
        int point = strategy.getPoint(price);
        System.out.println(point + " 포인트가 적립되었습니다!");
    }

}
