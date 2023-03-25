package com.lhj8390.behavioral.visitor;

public class Computer implements Product {

    private final String name;

    public Computer(String name) {
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
