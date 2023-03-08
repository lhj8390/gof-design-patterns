package com.lhj8390.structural.proxy;

public class FileProxy implements File {
    private TextFile textFile;
    private final String fileName;

    public FileProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void read() {
        if (textFile == null) {
            textFile = new TextFile(fileName);
        }
        textFile.read();
    }
}
