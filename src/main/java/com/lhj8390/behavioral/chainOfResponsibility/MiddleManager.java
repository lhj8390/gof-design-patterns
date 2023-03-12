package com.lhj8390.behavioral.chainOfResponsibility;

public class MiddleManager extends Manager {

    public MiddleManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if (request.getRequestType() == RequestType.PURCHASE) {
            System.out.println("MiddleManager 가 처리중입니다 : " + request.getRequestType());
        } else {
            superior.requestApplications(request);
        }
    }
}
