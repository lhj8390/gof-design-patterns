package com.lhj8390.creational.factoryMethod;

public class ComputerCreator extends Creator {
    @Override
    public Product createProduct() {
        return new Computer();
    }
}
