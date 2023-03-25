package com.lhj8390.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Alarm implements Observable {
    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notify(String data) {
        for (Observer observer: observers) {
            observer.update(data);
        }
    }
}
