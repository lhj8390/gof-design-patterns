package com.lhj8390.behavioral.memento;

public class MementoDemo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        EditorHistory editorHistory = new EditorHistory();

        editor.setHistory(HistoryType.JOIN, "입장..");
        editorHistory.save(editor);

        editor.setHistory(HistoryType.WORK, "작업중...");
        editorHistory.save(editor);

        editor.setHistory(HistoryType.FINISH, "작업 완료");
        editorHistory.save(editor);

        System.out.println(editor);
        System.out.println("=== 이전 상태로 되돌리기 ===");
        editorHistory.revert(editor);
        System.out.println("history 에서 삭제 : " + editor);
        editorHistory.revert(editor);
        System.out.println("history 에서 삭제 : " + editor);

    }
}
