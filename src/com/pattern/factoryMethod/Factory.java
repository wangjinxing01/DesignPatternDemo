package com.pattern.factoryMethod;

import java.util.LinkedList;
import java.util.List;

public abstract class Factory {
    private List<Product> allProduct;

    public Factory() {
        allProduct = new LinkedList<>();
    }

    public final Product create() {
        Product product = createProduct();
        regesiteProduct(product);
        return product;
    }

    protected final void regesiteProduct(Product product) {
        allProduct.add(product);
    };

    protected abstract Product createProduct();
}
