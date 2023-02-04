package com.lhj8390.creational.abstractFactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        BaseProductFactory factory = FactoryProducer.getFactory(ProductType.COMPUTER);
        Product productA = factory.createProduct("LG gram");
        productA.buy();
        productA.use();

        factory = FactoryProducer.getFactory(ProductType.PHONE);
        Product productB = factory.createProduct("Galaxy S22");
        productB.buy();
        productB.use();

        factory = FactoryProducer.getFactory(ProductType.TABLET);
        Product productC = factory.createProduct("갤럭시탭");
        productC.buy();
        productC.use();
    }
}
