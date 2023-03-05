package com.lhj8390.structural.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Pizza basePizza = new BasePizza();
        basePizza.addIngredients();

        Pizza cheesePizza = new Cheese(basePizza);
        cheesePizza.addIngredients();
        Pizza meatPizza = new Meat(new Cheese(basePizza));
        meatPizza.addIngredients();
        Pizza potatoPizza = new Potato(basePizza);
        potatoPizza.addIngredients();

    }
}
