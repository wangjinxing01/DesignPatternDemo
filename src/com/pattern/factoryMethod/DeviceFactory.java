package com.pattern.factoryMethod;

public class DeviceFactory extends Factory {

    @Override
    public Product createProduct() {
        return new Device();
    }
}
