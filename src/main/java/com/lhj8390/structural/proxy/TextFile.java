package com.lhj8390.structural.proxy;

public class TextFile implements File {

    private final String fileName;

    public TextFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void read() {
        System.out.println(fileName + " 을 읽습니다.");
    }
}
