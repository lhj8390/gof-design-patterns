package com.lhj8390.behavioral.templateMethod;

public class TemplateMethodDemo {
    public static void main(String[] args) {
        Computer samsung = new Samsung();
        samsung.open();

        Computer lg = new LG();
        lg.open();
    }
}
