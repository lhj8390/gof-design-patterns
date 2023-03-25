package com.lhj8390.behavioral.visitor;

public class OfflineOrder implements Visitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("매장에서 " + computer.getName() + " 을 주문합니다." );
    }

    @Override
    public void visit(Phone phone) {
        System.out.println("매장에서 " + phone.getName() + " 을 주문합니다." );
    }
}
