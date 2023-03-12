package com.lhj8390.behavioral.interpreter;

public class InterpreterDemo {
    public static void main(String[] args) {

        String data = "Computer Tablet";
        Context context = new Context(data);
        Expression terminal1 = new TerminalExpression("Computer");
        Expression terminal2 = new TerminalExpression("Phone");
        Expression and = new AndExpression(terminal1, terminal2);

        Expression terminal3 = new TerminalExpression("Tablet");
        Expression or = new OrExpression(terminal2, terminal3);

        boolean andResult = and.interpret(context);
        boolean orResult = or.interpret(context);

        System.out.println("The expression \"" + data + "\" is " + (andResult ? "valid" : "invalid") + ".");
        System.out.println("The expression \"" + data + "\" is " + (orResult ? "valid" : "invalid") + ".");

    }
}
