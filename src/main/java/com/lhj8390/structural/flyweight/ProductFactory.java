package com.lhj8390.structural.flyweight;

import java.util.HashMap;

public class ProductFactory {
    private static final HashMap<ProductType, Product> products = new HashMap<>();

    public static Product getProduct(ProductType type) {
        if (!products.containsKey(type)) {
            products.put(type, new Product(type));
        }
        return products.get(type);
    }

}
