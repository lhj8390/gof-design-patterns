package com.lhj8390.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements Mediator {

    private final List<User> userList = new ArrayList<>();

    public void addClient(User user) {
        userList.add(user);
    }
    @Override
    public void notify(User user, String message) {
        if (userList.contains(user)) {
            user.receive(message);
        } else {
            System.out.println("주의 : 해당 유저는 없습니다.");
        }
    }
}
