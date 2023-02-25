package com.lhj8390.structural.composite;

public class CompositeDemo {

    public static void main(String[] args) {

        Menu admin = new Menu("admin", "/admin");
        MenuItem project = new MenuItem("project", "/admin/project");
        MenuItem user = new MenuItem("user", "/admin/user");

        admin.add(project);
        admin.add(user);

        System.out.println(admin.showMenu());

    }
}
