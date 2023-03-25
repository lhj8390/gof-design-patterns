package com.lhj8390.behavioral.visitor;

public interface Visitor {
    void visit(Computer computer);

    void visit(Phone phone);
}
