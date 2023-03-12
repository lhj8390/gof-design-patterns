package com.lhj8390.behavioral.chainOfResponsibility;

public class GeneralManager extends Manager {

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if (request.getRequestType() == RequestType.PURCHASE && request.getAmount() < 10) {
            System.out.println("GeneralManager 갸 처리중입니다 : " + request.getRequestType());
        } else {
            superior.requestApplications(request);
        }
    }
}
