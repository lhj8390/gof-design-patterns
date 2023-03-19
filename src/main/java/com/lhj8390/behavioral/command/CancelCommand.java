package com.lhj8390.behavioral.command;

public class CancelCommand implements Command {

    private final Order order;

    public CancelCommand(Order order) {
        this.order = order;
    }
    @Override
    public void execute() {
        order.cancel();
    }
}
