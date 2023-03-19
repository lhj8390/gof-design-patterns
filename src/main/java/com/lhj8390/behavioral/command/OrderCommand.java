package com.lhj8390.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class OrderCommand {

    private final List<Command> commandList = new ArrayList<>();

    public void setCommand(Command command) {
        commandList.add(command);
    }

    public void executeAll() {
        for (Command c: commandList) {
            c.execute();
        }
    }
}
