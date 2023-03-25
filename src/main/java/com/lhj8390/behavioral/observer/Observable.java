package com.lhj8390.behavioral.observer;

public interface Observable {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notify(String data);
}
