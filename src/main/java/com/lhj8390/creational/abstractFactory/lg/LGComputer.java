package com.lhj8390.creational.abstractFactory.lg;

import com.lhj8390.creational.abstractFactory.Computer;

public class LGComputer extends Computer {
    @Override
    public void use() {
        System.out.println("LG 컴퓨터를 사용합니다.");
    }
}
