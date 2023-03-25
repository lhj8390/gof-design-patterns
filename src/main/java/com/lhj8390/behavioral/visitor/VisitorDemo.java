package com.lhj8390.behavioral.visitor;

public class VisitorDemo {

    public static void main(String[] args) {
        ObjectStructure products = new ObjectStructure();

        Computer computer = new Computer("삼성 컴퓨터");
        Phone galaxy = new Phone("Galaxy S23");
        Phone iphone = new Phone("아이폰 14");

        products.attach(computer);
        products.attach(galaxy);
        products.attach(iphone);

        products.accept(new OfflineOrder());

        // product 제거
        products.detach(iphone);
        products.accept(new OnlineOrder());
    }
}
