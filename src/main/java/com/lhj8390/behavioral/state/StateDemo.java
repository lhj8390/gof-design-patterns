package com.lhj8390.behavioral.state;

public class StateDemo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOff();

        // 컴퓨터를 실행하고 작업 수행
        computer.powerOn();
        computer.work();

        // 컴퓨터를 종료하고 작업 수행
        computer.powerOff();
        computer.work();
    }
}
