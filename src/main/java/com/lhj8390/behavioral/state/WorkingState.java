package com.lhj8390.behavioral.state;

public class WorkingState implements State {
    private final Computer computer;

    public WorkingState(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void powerOff() {
        System.out.println("진행중인 작업을 종료하고 컴퓨터를 끕니다...");
        computer.setCurrentState(new PowerOffState(computer));
    }

    @Override
    public void powerOn() {
        System.out.println("컴퓨터가 이미 켜져 있습니다.");
    }

    @Override
    public void onWork() {
        System.out.println("다른 작업을 실행합니다.");
    }
}
