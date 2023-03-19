package com.lhj8390.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class CommandDemo {
    public static void main(String[] args) {
        Order computerOrder = new Order(ProductType.COMPUTER, 1000000);
        Order phoneOrder = new Order(ProductType.PHONE, 500000);

        OrderCommand order1 = new OrderCommand();
        OrderCommand order2 = new OrderCommand();

        order1.setCommand(new BuyCommand(computerOrder));
        order1.setCommand(new CancelCommand(computerOrder));
        order1.executeAll();

        order2.setCommand(new BuyCommand(phoneOrder));
        order2.setCommand(new CancelCommand(phoneOrder));
        order2.executeAll();


    }
}
