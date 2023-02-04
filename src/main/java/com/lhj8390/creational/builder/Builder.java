package com.lhj8390.creational.builder;

abstract class Builder {
    Product product = new Product();

    public abstract Builder buildName();
    public abstract Builder buildPrice();
    public abstract Builder buildType();

    public Product getResult() {
        return product;
    }
}
