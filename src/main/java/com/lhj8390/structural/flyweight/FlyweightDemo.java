package com.lhj8390.structural.flyweight;

public class FlyweightDemo {
    public static void main(String[] args) {
        Product computer1 = ProductFactory.getProduct(ProductType.COMPUTER);
        computer1.buy();
        Product computer2 = ProductFactory.getProduct(ProductType.COMPUTER);
        computer2.buy();

        Product phone1 = ProductFactory.getProduct(ProductType.PHONE);
        phone1.buy();
        Product phone2 = ProductFactory.getProduct(ProductType.PHONE);
        phone2.buy();
    }
}
