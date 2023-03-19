package com.lhj8390.behavioral.command;

public class Order {

    private final ProductType productType;
    private final int price;

    public Order(ProductType productType, int price) {
        this.productType = productType;
        this.price = price;
    }

    public void buy() {
        System.out.printf("%s 을 %d 가격으로 구매합니다.%n", productType, price);
    }

    public void cancel() {
        System.out.printf("%s 구매를 취소합니다.%n", productType);
    }
}
