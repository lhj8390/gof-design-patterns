package com.lhj8390.creational.factoryMethod;

public class PhoneCreator extends Creator {
    @Override
    public Product createProduct() {
        return new Phone();
    }
}
