package com.lhj8390.behavioral.templateMethod;

public abstract class Computer {
    abstract void initialize();
    abstract void turnOn();
    abstract void turnOff();
    public final void open() {
        initialize();
        turnOn();
        turnOff();
    }
}
