package com.lhj8390.structural.facade;

public class FacadeDemo {
    public static void main(String[] args) {
        ShopFacade shopFacade = new ShopFacade();
        shopFacade.buyProduct("user1@naver.com");
    }
}
