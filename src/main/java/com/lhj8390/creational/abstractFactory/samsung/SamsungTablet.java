package com.lhj8390.creational.abstractFactory.samsung;

import com.lhj8390.creational.abstractFactory.Tablet;

public class SamsungTablet extends Tablet {
    @Override
    public void use() {
        System.out.println("삼성 태블릿을 사용합니다.");
    }
}
