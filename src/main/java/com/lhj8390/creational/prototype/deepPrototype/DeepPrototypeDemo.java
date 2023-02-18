package com.lhj8390.creational.prototype.deepPrototype;


public class DeepPrototypeDemo {
    public static void main(String[] args) {
        Address address = new Address("Montgomery", "36104");
        Person person = new Person(1L, "사람 1", address);

        System.out.println("Person : " + person);
        System.out.println("Person name : " + person.getName());
        System.out.println("Address : " + person.getAddress());
        System.out.println("Address Location: " + person.getAddress().getLocation());

        Person clone = person.clone();
        Address cloneAddr = clone.getAddress();

        // clone 객체 값 변경
        clone.setName("사람 2");
        cloneAddr.setLocation("Phoenix");
        cloneAddr.setZipCode("85001");

        System.out.println("clone : " + clone);
        System.out.println("clone name : " + clone.getName());
        System.out.println("Address : " + clone.getAddress());
        System.out.println("Address Location: " + clone.getAddress().getLocation());

    }
}
