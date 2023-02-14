package com.lhj8390.creational.factoryMethod;

public abstract class Creator {

    public abstract Product createProduct();

    void useProduct() {
        Product product = createProduct();
        product.use();
    }
}
