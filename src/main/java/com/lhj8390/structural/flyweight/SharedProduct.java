package com.lhj8390.structural.flyweight;

public class SharedProduct implements Product {
    private final ProductType type;

    public SharedProduct(ProductType type) {
        this.type = type;
    }

    @Override
    public void buy() {
        System.out.println(type + " 을 구매합니다.");
    }
}
