package com.lhj8390.behavioral.strategy;

public class Payment {
    private final int price;
    private final Strategy strategy;

    public Payment(PaymentMethod paymentMethod, int price) {
        this.price = price;
        System.out.println(paymentMethod + " 방식으로 결제합니다.");

        switch (paymentMethod) {
            case CASH:
                strategy = new CashStrategy();
                break;
            case PHONE:
                strategy = new PhoneStrategy();
                break;
            case CARD:
                strategy = new CardStrategy();
                break;
            default:
                throw new IllegalArgumentException("잘못된 결제 방법입니다.");
        }
    }

    public void getPoint() {
        int point = strategy.getPoint(price);
        System.out.println(point + " 포인트가 적립되었습니다!");
    }

}
