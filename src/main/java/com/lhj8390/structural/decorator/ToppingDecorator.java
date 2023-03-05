package com.lhj8390.structural.decorator;

public abstract class ToppingDecorator implements Pizza {
    Pizza basePizza;

    public ToppingDecorator(Pizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public void addIngredients() {
        basePizza.addIngredients();
    }
}
