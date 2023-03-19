package com.lhj8390.behavioral.command;

public class BuyCommand implements Command {
    private final Order order;

    public BuyCommand(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        order.buy();
    }
}
