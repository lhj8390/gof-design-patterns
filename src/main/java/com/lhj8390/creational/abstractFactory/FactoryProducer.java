package com.lhj8390.creational.abstractFactory;

import com.lhj8390.creational.abstractFactory.lg.LGFactory;
import com.lhj8390.creational.abstractFactory.samsung.SamsungFactory;

public class FactoryProducer {

    static BaseProductFactory getFactory(ProductType type) {
        switch (type) {
            case SAMSUNG:
                return new SamsungFactory();
            case LG:
                return new LGFactory();
            default:
                throw new IllegalArgumentException();
        }
    }
}
