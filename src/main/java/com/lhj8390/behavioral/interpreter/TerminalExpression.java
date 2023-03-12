package com.lhj8390.behavioral.interpreter;

public class TerminalExpression implements Expression {

    private final String data;

    public TerminalExpression(String data) {
        this.data = data;
    }
    @Override
    public boolean interpret(Context context) {
        System.out.println(context.lookup(data));
        return context.lookup(data);
    }
}
