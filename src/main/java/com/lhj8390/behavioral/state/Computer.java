package com.lhj8390.behavioral.state;

public class Computer {
    private State currentState;

    public Computer() {
        currentState = new PowerOffState(this);
    }

    public void powerOn() {
        currentState.powerOn();
    }

    public void powerOff() {
        currentState.powerOff();
    }

    public void work() {
        currentState.onWork();
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
}
