package com.pattern.factoryMethod;

public class BuildingModelFactory extends Factory {

    @Override
    public Product createProduct() {
        return new Wall();
    }
}
