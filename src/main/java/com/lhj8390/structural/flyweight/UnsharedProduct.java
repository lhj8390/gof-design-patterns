package com.lhj8390.structural.flyweight;

public class UnsharedProduct implements Product {
    private final ProductType type;
    private final int price;

    public UnsharedProduct(ProductType type, int price) {
        this.type = type;
        this.price = price;
    }

    @Override
    public void buy() {
        System.out.println(price + " 가격으로 " + type + " 을 구매합니다.");
    }
}
