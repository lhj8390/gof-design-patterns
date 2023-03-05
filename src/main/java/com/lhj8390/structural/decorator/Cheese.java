package com.lhj8390.structural.decorator;

public class Cheese extends ToppingDecorator {
    public Cheese(Pizza basePizza) {
        super(basePizza);
    }

    @Override
    public void addIngredients() {
        super.addIngredients();
        System.out.println("치즈를 추가합니다.");
    }
}
