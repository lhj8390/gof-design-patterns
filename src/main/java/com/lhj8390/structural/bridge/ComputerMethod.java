package com.lhj8390.structural.bridge;

public class ComputerMethod implements ProductMethod {
    @Override
    public void buy() {
        System.out.println("컴퓨터를 삽니다.");
    }

    @Override
    public void use() {
        System.out.println("컴퓨터를 사용합니다.");
    }
}
