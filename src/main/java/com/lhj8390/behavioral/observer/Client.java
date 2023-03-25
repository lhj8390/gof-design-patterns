package com.lhj8390.behavioral.observer;

public class Client implements Observer {
    private final String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void update(String data) {
        System.out.println(name + " 에게 알람이 도착하였습니다...");
        System.out.println(data);
    }
}
