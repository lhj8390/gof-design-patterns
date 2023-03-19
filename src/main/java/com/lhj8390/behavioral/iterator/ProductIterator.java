package com.lhj8390.behavioral.iterator;


public class ProductIterator implements Iterator<Product> {

    private final Product[] productList;
    private int position;

    public ProductIterator(Product[] productList) {
        this.productList = productList;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return (position < productList.length);
    }

    @Override
    public Product next() {
        return (this.hasNext())? productList[position++] : null;
    }
}
