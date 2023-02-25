package com.lhj8390.structural.bridge;

public class PhoneMethod implements ProductMethod {
    @Override
    public void buy() {
        System.out.println("핸드폰을 삽니다.");
    }

    @Override
    public void use() {
        System.out.println("핸드폰을 사용합니다.");
    }
}
