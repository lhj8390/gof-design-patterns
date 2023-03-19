package com.lhj8390.behavioral.iterator;

import java.util.stream.IntStream;

public class IteratorDemo {
    public static void main(String[] args) {
        Product[] products = IntStream.range(1, 6)
                .mapToObj(i -> new Product("product" + i, 1000 * i))
                .toArray(Product[]::new);
        ProductCollection productCollection = new ProductCollection(products);

        Iterator<Product> iterator = productCollection.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
