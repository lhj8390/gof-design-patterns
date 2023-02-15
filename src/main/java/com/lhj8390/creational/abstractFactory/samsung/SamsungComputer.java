package com.lhj8390.creational.abstractFactory.samsung;

import com.lhj8390.creational.abstractFactory.Computer;

public class SamsungComputer extends Computer {
    @Override
    public void use() {
        System.out.println("삼성 컴퓨터를 사용합니다.");
    }
}
