package com.lhj8390.structural.flyweight;

public class Product {
    private final ProductType type;

    public Product(ProductType type) {
        this.type = type;
    }

    public void buy() {
        System.out.println(type + " 을 삽니다.");
    }
}
