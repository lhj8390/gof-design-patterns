package com.lhj8390.behavioral.observer;

public class ObserverDemo {
    public static void main(String[] args) {
        Alarm alarm = new Alarm();

        Client client1 = new Client("client1");
        Client client2 = new Client("client2");
        alarm.subscribe(client1);
        alarm.subscribe(client2);

        System.out.println("'알람 1' 전송 중..");
        alarm.notify("알람 1");

        alarm.unsubscribe(client2);
        System.out.println("'알람 2' 전송 중..");
        alarm.notify("알람 2");
    }
}
