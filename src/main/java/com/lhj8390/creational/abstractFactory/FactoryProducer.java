package com.lhj8390.creational.abstractFactory;

import com.lhj8390.creational.abstractFactory.computer.ComputerFactory;
import com.lhj8390.creational.abstractFactory.phone.PhoneFactory;
import com.lhj8390.creational.abstractFactory.tablet.TabletFactory;

public class FactoryProducer {

    static BaseProductFactory getFactory(ProductType type) {
        switch (type) {
            case COMPUTER:
                return new ComputerFactory();
            case TABLET:
                return new TabletFactory();
            case PHONE:
                return new PhoneFactory();
            default:
                throw new IllegalArgumentException();
        }
    }
}
