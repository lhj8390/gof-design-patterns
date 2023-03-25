package com.lhj8390.behavioral.memento;

import java.util.Stack;

public class EditorHistory {
    private final Stack<EditorMemento> editorHistory = new Stack<>();

    public void save(Editor editor) {
        editorHistory.push(editor.save());
    }

    public void revert(Editor editor) {
        editor.revert(editorHistory.pop());
    }

}
