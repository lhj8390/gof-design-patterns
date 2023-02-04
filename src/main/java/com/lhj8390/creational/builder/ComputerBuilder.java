package com.lhj8390.creational.builder;

public class ComputerBuilder extends Builder {
    @Override
    public Builder buildName() {
        product.setName("LG gram");
        return this;
    }

    @Override
    public Builder buildPrice() {
        product.setPrice(3000000);
        return this;
    }

    @Override
    public Builder buildType() {
        product.setType("computer");
        return this;
    }
}
