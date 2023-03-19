package com.lhj8390.behavioral.mediator;

public class Client implements User {

    private final String name;
    private final Mediator chatMediator;

    public Client(String name, Mediator chatMediator) {
        this.name = name;
        this.chatMediator = chatMediator;
    }

    @Override
    public void send(User user, String message) {
        System.out.println(name + " 유저가 메시지를 보냅니다....");
        chatMediator.notify(user, message);
    }

    @Override
    public void receive(String message) {
        System.out.println(name + " 유저가 메시지를 받았습니다 : " + message);
    }
}
