package com.lhj8390.structural.bridge;

public class Phone extends Product {
    public Phone(ProductMethod productMethod) {
        super(productMethod);
    }

    @Override
    void buyAndUse() {
        productMethod.buy();
        productMethod.use();
    }
}
