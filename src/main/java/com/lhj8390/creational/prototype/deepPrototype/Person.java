package com.lhj8390.creational.prototype.deepPrototype;

public class Person implements Cloneable {
    private Long id;
    private String name;
    private Address address;

    public Person(Long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public Person clone() {
        try {
            Person clone = (Person) super.clone();
            clone.setAddress(clone.getAddress().clone());
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
