package com.lhj8390.structural.bridge;

public class Computer extends Product {
    public Computer(ProductMethod productMethod) {
        super(productMethod);
    }

    @Override
    void buyAndUse() {
        productMethod.buy();
        productMethod.use();
    }
}
