package com.lhj8390.creational.abstractFactory.tablet;

import com.lhj8390.creational.abstractFactory.Product;

public class Tablet extends Product {
    private final String name;
    public Tablet(String name) {
        this.name = name;
    }
    @Override
    public void use() {
        System.out.println(name + " 태블릿을 사용합니다.");
    }
}
