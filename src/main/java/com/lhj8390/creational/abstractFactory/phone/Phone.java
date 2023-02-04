package com.lhj8390.creational.abstractFactory.phone;

import com.lhj8390.creational.abstractFactory.Product;

public class Phone extends Product {
    private final String name;
    public Phone(String name) {
        this.name = name;
    }
    @Override
    public void use() {
        System.out.println(name + " 핸드폰을 사용합니다.");
    }
}
