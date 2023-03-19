package com.lhj8390.behavioral.mediator;

public interface User {
    void send(User user, String message);
    void receive(String message);
}
