package com.lhj8390.behavioral.state;

public class PowerOffState implements State {
    private final Computer computer;

    public PowerOffState(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void powerOff() {
        System.out.println("컴퓨터가 이미 꺼져 있습니다.");
    }

    @Override
    public void powerOn() {
        System.out.println("컴퓨터를 킵니다.");
        computer.setCurrentState(new PowerOnState(computer));
    }

    @Override
    public void onWork() {
        System.out.println("컴퓨터가 꺼져 있어 작업을 진행할 수 없습니다.");
    }

}
