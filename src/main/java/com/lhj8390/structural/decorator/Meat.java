package com.lhj8390.structural.decorator;

public class Meat extends ToppingDecorator {
    public Meat(Pizza basePizza) {
        super(basePizza);
    }

    @Override
    public void addIngredients() {
        super.addIngredients();
        System.out.println("고기를 추가합니다.");
    }
}
