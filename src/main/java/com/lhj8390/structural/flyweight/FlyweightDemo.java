package com.lhj8390.structural.flyweight;

public class FlyweightDemo {
    public static void main(String[] args) {
        Product computer1 = ProductFactory.getProduct(ProductType.COMPUTER);
        computer1.buy();
        Product computer2 = ProductFactory.getProduct(ProductType.COMPUTER);
        computer2.buy();

        System.out.println("computer1 == computer2 : " + (computer1 == computer2));

        Product phone1 = ProductFactory.getProduct(ProductType.PHONE);
        phone1.buy();
        Product phone2 = ProductFactory.getProduct(ProductType.PHONE);
        phone2.buy();

        System.out.println("phone1 == phone2 : " + (phone1 == phone2));

        // unshared product 생성 (고유한 속성)
        Product tablet1 = ProductFactory.getProduct(ProductType.TABLET, 100000);
        tablet1.buy();
        Product tablet2 = ProductFactory.getProduct(ProductType.TABLET, 300000);
        tablet2.buy();

        System.out.println("tablet1 == tablet2 : " + (tablet1 == tablet2));
    }
}
