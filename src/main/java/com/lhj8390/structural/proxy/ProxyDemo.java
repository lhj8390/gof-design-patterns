package com.lhj8390.structural.proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        File file1 = new FileProxy("test1.txt");
        File file2 = new FileProxy("test2.txt");

        file1.read();
        file1.read();
        file2.read();
        file2.read();
    }
}
