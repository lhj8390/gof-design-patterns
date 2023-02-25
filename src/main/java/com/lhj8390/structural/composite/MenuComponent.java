package com.lhj8390.structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {
    private final String name;
    private final String url;

    public MenuComponent(String name, String url) {
        this.name = name;
        this.url = url;
    }

    List<MenuComponent> menuList = new ArrayList<>();

    abstract String showMenu();

    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}
