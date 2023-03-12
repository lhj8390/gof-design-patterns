package com.lhj8390.behavioral.chainOfResponsibility;

public class SuperManager extends Manager {

    public SuperManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        System.out.println("SuperManager 가 처리중입니다 : " + request.getRequestType());
    }
}
