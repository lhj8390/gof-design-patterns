package com.lhj8390.creational.factoryMethod;

public class FactoryMethodDemo {

    public static void main(String[] args) {

        Creator computerCreator = new ComputerCreator();
        computerCreator.useProduct();

        Creator phoneCreator = new PhoneCreator();
        phoneCreator.useProduct();
    }
}
