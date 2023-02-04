package com.lhj8390.creational.builder;

public class PhoneBuilder extends Builder {
    @Override
    public Builder buildName() {
        product.setName("Galaxy S22");
        return this;
    }

    @Override
    public Builder buildPrice() {
        product.setPrice(1000000);
        return this;
    }

    @Override
    public Builder buildType() {
        product.setType("phone");
        return this;
    }
}
