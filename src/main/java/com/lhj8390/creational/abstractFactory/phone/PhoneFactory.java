package com.lhj8390.creational.abstractFactory.phone;

import com.lhj8390.creational.abstractFactory.BaseProductFactory;
import com.lhj8390.creational.abstractFactory.Product;

public class PhoneFactory extends BaseProductFactory {
    @Override
    public Product createProduct(String name) {
        return new Phone(name);
    }
}
