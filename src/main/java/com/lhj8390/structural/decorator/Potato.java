package com.lhj8390.structural.decorator;

public class Potato extends ToppingDecorator {
    public Potato(Pizza basePizza) {
        super(basePizza);
    }

    @Override
    public void addIngredients() {
        super.addIngredients();
        System.out.println("감자를 추가합니다.");
    }
}
