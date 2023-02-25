package com.lhj8390.structural.composite;

public class Menu extends MenuComponent {

    public Menu(String name, String url) {
        super(name, url);
    }

    @Override
    String showMenu() {
        StringBuilder builder = new StringBuilder();
        builder.append(getName())
                .append(": ")
                .append(getUrl())
                .append("\n");
        menuList.forEach(menuItem ->
                builder.append(menuItem.showMenu())
        );
        return builder.toString();
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuList.remove(menuComponent);
    }
}
