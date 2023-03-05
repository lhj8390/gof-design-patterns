package com.lhj8390.structural.decorator;

public class BasePizza implements Pizza {
    @Override
    public void addIngredients() {
        System.out.println("기본 재료로 피자를 만듭니다.");
    }
}
