package com.lhj8390.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
    private final List<Product> productList = new ArrayList<>();

    public void attach(Product product) {
        productList.add(product);
    }

    public void detach(Product product) {
        productList.remove(product);
    }

    public void accept(Visitor visitor) {
        productList.forEach(p -> p.accept(visitor));
    }
}
