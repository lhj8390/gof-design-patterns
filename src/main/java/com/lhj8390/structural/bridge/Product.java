package com.lhj8390.structural.bridge;

public abstract class Product {

    final ProductMethod productMethod;

    public Product(ProductMethod productMethod) {
        this.productMethod = productMethod;
    }
    abstract void buyAndUse();
}
