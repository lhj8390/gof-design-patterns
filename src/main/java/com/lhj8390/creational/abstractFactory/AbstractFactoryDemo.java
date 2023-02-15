package com.lhj8390.creational.abstractFactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        BaseProductFactory samsungFactory = FactoryProducer.getFactory(ProductType.SAMSUNG);
        BaseProductFactory lgFactory = FactoryProducer.getFactory(ProductType.LG);

        Computer samsungComputer = samsungFactory.createComputer();
        samsungComputer.buy();
        samsungComputer.use();

        Tablet samsungTablet = samsungFactory.createTablet();
        samsungTablet.buy();
        samsungTablet.use();

        Phone samsungPhone = samsungFactory.createPhone();
        samsungPhone.buy();
        samsungPhone.use();


        Computer lgComputer = lgFactory.createComputer();
        lgComputer.buy();
        lgComputer.use();

        Tablet lgTablet = lgFactory.createTablet();
        lgTablet.buy();
        lgTablet.use();

        Phone lgPhone = lgFactory.createPhone();
        lgPhone.buy();
        lgPhone.use();

    }
}
