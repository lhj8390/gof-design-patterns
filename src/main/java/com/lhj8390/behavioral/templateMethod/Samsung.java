package com.lhj8390.behavioral.templateMethod;

public class Samsung extends Computer {
    @Override
    void initialize() {
        System.out.println("삼성 컴퓨터입니다.");
    }

    @Override
    void turnOn() {
        System.out.println("삼성 컴퓨터 전원을 킵니다.");
    }

    @Override
    void turnOff() {
        System.out.println("삼성 컴퓨터 전원을 끕니다.");
    }
}
