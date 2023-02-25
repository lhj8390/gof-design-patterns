package com.lhj8390.structural.bridge;

public class BridgeDemo {

    public static void main(String[] args) {
        Product computer = new Computer(new ComputerMethod());
        Product phone = new Phone(new PhoneMethod());

        computer.buyAndUse();
        phone.buyAndUse();
    }
}
