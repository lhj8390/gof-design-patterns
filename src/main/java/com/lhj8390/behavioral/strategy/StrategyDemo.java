package com.lhj8390.behavioral.strategy;

public class StrategyDemo {

    public static void main(String[] args) {

        Payment card = new Payment(new CardStrategy(), 10000);
        card.getPoint();

        Payment cash = new Payment(new CashStrategy(), 10000);
        cash.getPoint();

        Payment phone = new Payment(new PhoneStrategy(), 10000);
        phone.getPoint();

    }
}
