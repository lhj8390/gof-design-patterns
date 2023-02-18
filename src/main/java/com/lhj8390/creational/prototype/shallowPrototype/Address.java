package com.lhj8390.creational.prototype.shallowPrototype;

public class Address {
    private String location;
    private String zipCode;

    public Address(String location, String zipCode) {
        this.location = location;
        this.zipCode = zipCode;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
