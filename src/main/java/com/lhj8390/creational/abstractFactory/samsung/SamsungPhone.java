package com.lhj8390.creational.abstractFactory.samsung;

import com.lhj8390.creational.abstractFactory.Phone;

public class SamsungPhone extends Phone {
    @Override
    public void use() {
        System.out.println("삼성 폰을 사용합니다.");
    }
}
