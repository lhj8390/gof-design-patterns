package com.lhj8390.creational.builder;

public class BuilderDemo {

    public static void main(String[] args) {
        Builder computerBuilder = new ComputerBuilder();
        Builder phoneBuilder = new PhoneBuilder();
        Director director1 = new Director(computerBuilder);
        Director director2 = new Director(phoneBuilder);

        Product computer = director1.construct();
        Product phone = director2.construct();

        System.out.println(computer);
        System.out.println(phone);
    }
}
