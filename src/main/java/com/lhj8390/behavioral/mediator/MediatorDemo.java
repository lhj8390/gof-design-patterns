package com.lhj8390.behavioral.mediator;

public class MediatorDemo {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediator();

        User user1 = new Client("user1", mediator);
        User user2 = new Client("user2", mediator);
        User user3 = new Client("user3", mediator);
        User user4 = new Client("user4", mediator);

        mediator.addClient(user1);
        mediator.addClient(user2);
        mediator.addClient(user3);

        user1.send(user3, "안녕하세요. user3");
        user3.send(user1, "안녕하세요.");
        user2.send(user4, "안녕하세요. user4");

    }
}
