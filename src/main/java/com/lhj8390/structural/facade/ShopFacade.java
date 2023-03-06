package com.lhj8390.structural.facade;

public class ShopFacade {

    private final AccountService accountService;
    private final PaymentService paymentService;
    private final ShippingService shippingService;

    public ShopFacade() {
        accountService = new AccountService();
        paymentService = new PaymentService();
        shippingService = new ShippingService();
    }

    public void buyProduct(String email) {
        accountService.login(email);
        paymentService.payment();
        shippingService.startShipping();
    }
}
