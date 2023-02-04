package com.lhj8390.creational.abstractFactory.computer;

import com.lhj8390.creational.abstractFactory.Product;

public class Computer extends Product {
    private final String name;
    public Computer(String name) {
        this.name = name;
    }
    @Override
    public void use() {
        System.out.println(name + " 컴퓨터를 사용합니다.");
    }
}
