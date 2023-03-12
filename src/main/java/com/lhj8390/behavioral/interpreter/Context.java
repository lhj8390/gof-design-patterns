package com.lhj8390.behavioral.interpreter;

public class Context {
    private final String context;

    public Context(String context) {
        this.context = context;
    }

    public boolean lookup(String data) {
        return context.contains(data);
    }
}
