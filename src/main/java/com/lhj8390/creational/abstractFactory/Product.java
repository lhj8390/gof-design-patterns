package com.lhj8390.creational.abstractFactory;

public abstract class Product {

    public abstract void use();

    public void buy() {
        System.out.println("제품을 구매하였습니다.");
    }
}
