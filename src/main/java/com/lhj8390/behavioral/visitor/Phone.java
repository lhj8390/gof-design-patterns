package com.lhj8390.behavioral.visitor;

public class Phone implements Product {

    private final String name;

    public Phone(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
