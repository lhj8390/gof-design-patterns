package com.lhj8390.creational.abstractFactory.tablet;

import com.lhj8390.creational.abstractFactory.BaseProductFactory;
import com.lhj8390.creational.abstractFactory.Product;

public class TabletFactory extends BaseProductFactory {
    @Override
    public Product createProduct(String name) {
        return new Tablet(name);
    }
}
