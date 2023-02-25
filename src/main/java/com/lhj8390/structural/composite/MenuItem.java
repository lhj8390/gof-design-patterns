package com.lhj8390.structural.composite;

public class MenuItem extends MenuComponent {

    public MenuItem(String name, String url) {
        super(name, url);
    }

    @Override
    String showMenu() {
        return getName() + ": " + getUrl() + "\n";
    }
}
