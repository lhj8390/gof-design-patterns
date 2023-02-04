package com.lhj8390.creational.abstractFactory.computer;

import com.lhj8390.creational.abstractFactory.BaseProductFactory;
import com.lhj8390.creational.abstractFactory.Product;

public class ComputerFactory extends BaseProductFactory {
    @Override
    public Product createProduct(String name) {
        return new Computer(name);
    }
}
