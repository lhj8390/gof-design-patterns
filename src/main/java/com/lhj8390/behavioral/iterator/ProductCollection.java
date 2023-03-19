package com.lhj8390.behavioral.iterator;

public class ProductCollection implements Iterable<Product> {

    private final Product[] productList;

    public ProductCollection(Product[] productList) {
        this.productList = productList;
    }

    @Override
    public Iterator<Product> iterator() {
        return new ProductIterator(productList);
    }
}
