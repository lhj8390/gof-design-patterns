package com.lhj8390.behavioral.strategy;

public class StrategyDemo {

    public static void main(String[] args) {

        Payment card = new Payment(PaymentMethod.CARD, 10000);
        card.getPoint();

        Payment cash = new Payment(PaymentMethod.CASH, 10000);
        cash.getPoint();

        Payment phone = new Payment(PaymentMethod.PHONE, 10000);
        phone.getPoint();

    }
}
