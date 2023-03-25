package com.lhj8390.behavioral.memento;

public class Editor {
    private HistoryType type;
    private String history;

    public void setHistory(HistoryType type, String history) {
        this.type = type;
        this.history = history;
    }

    public EditorMemento save() {
        return new EditorMemento(type, history);
    }

    public void revert(EditorMemento editorMemento) {
        this.type = editorMemento.getType();
        this.history = editorMemento.getHistory();
    }

    @Override
    public String toString() {
        return "type=" + type +", history=" + history;
    }
}
