package com.lhj8390.behavioral.state;

public class PowerOnState implements State {
    private final Computer computer;

    public PowerOnState(Computer computer) {
        this.computer = computer;
    }
    @Override
    public void powerOff() {
        System.out.println("컴퓨터를 끕니다.");
        computer.setCurrentState(new PowerOffState(computer));
    }

    @Override
    public void powerOn() {
        System.out.println("컴퓨터가 이미 켜져 있습니다.");
    }

    @Override
    public void onWork() {
        System.out.println("컴퓨터로 작업을 시작합니다.");
        computer.setCurrentState(new WorkingState(computer));
    }
}
