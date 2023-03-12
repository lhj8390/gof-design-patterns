package com.lhj8390.behavioral.chainOfResponsibility;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        Manager manager = new GeneralManager("일반관리자");
        Manager middleManager = new MiddleManager("중간관리자");
        Manager superManager = new SuperManager("슈퍼관리자");

        // 다음으로 request 를 넘길 manager 설정
        manager.setSuperior(middleManager);
        middleManager.setSuperior(superManager);

        Request purchase = new Request(RequestType.PURCHASE, 1000);
        Request cancel = new Request(RequestType.CANCEL, 10);
        manager.requestApplications(purchase);
        manager.requestApplications(cancel);
    }
}
