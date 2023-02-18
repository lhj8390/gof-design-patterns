package com.lhj8390.creational.prototype.shallowPrototype;

public class ShallowPrototypeDemo {
    public static void main(String[] args) {
        Person person = new Person(1L, "사람 1", new Address("Montgomery", "36104"));
        System.out.println("Person : " + person);
        System.out.println("Person name : " + person.getName());
        System.out.println("Address : " + person.getAddress());

        Person clone = person.clone();
        System.out.println("clone : " + clone);
        clone.setName("사람 2");
        System.out.println("clone name : " + clone.getName());
        System.out.println("Address : " + clone.getAddress());
    }
}
