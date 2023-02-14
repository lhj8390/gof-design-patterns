package com.lhj8390.creational.factoryMethod;

public class Computer implements Product {
    @Override
    public void use() {
        System.out.println("컴퓨터를 사용합니다.");
    }
}
