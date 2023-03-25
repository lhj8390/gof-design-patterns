package com.lhj8390.behavioral.memento;

public class EditorMemento {
    private final HistoryType type;
    private final String history;

    public EditorMemento(HistoryType type, String history) {
        this.type = type;
        this.history = history;
    }

    public HistoryType getType() {
        return type;
    }
    public String getHistory() {
        return history;
    }

}
