package com.lhj8390.creational.builder;

public class Director {
    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Product construct() {
        return builder.buildName()
                .buildPrice()
                .buildType()
                .getResult();
    }
}
